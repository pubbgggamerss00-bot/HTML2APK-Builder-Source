package com.android.apksig.internal.compat;

import java.util.Objects;

@FunctionalInterface
/* loaded from: classes.dex */
public interface IntConsumerCompat {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$andThen$0(IntConsumerCompat intConsumerCompat, int i10) {
        accept(i10);
        intConsumerCompat.accept(i10);
    }

    void accept(int i10);

    default IntConsumerCompat andThen(final IntConsumerCompat intConsumerCompat) {
        Objects.requireNonNull(intConsumerCompat);
        return new IntConsumerCompat() { // from class: c8.a
            @Override // com.android.apksig.internal.compat.IntConsumerCompat
            public final void accept(int i10) {
                this.f5017a.lambda$andThen$0(intConsumerCompat, i10);
            }
        };
    }
}
