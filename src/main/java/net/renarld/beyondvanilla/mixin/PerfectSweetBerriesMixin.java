package net.renarld.beyondvanilla.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.renarld.beyondvanilla.registry.BlockRegistration;
import net.renarld.beyondvanilla.registry.ItemRegistration;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import static net.minecraft.block.Block.dropStack;

@Mixin(net.minecraft.block.SweetBerryBushBlock.class)
public class PerfectSweetBerriesMixin {
    @Shadow @Final public static IntProperty AGE;

    @Inject(method = "onUse", at = @At("HEAD"), cancellable = true)
    public void mixin(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit, CallbackInfoReturnable<ActionResult> info) {
        int age = state.get(AGE);
        boolean max_age = age == 3;

        if (!max_age && player.getStackInHand(hand).getItem() == Items.BONE_MEAL) {
            info.setReturnValue(ActionResult.PASS);
        } else if (age > 1) {
            int perfect_sweet_berry_roll = world.random.nextInt(300);

            if (perfect_sweet_berry_roll > 298) {
                dropStack(world, pos, new ItemStack(ItemRegistration.PERFECT_SWEET_BERRIES, 1));
                world.playSound(null, pos, SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
                world.setBlockState(pos, state.with(AGE, 1), 2);
                info.setReturnValue(ActionResult.success(world.isClient));
            }

        }
    }
}
