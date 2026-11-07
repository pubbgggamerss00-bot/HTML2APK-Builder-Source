package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wc extends m92 {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc(String str, int i6) {
        super(str);
        this.A = i6;
    }

    @Override // com.google.android.gms.internal.ads.m92
    public final void c(ByteBuffer byteBuffer) {
        switch (this.A) {
            case 0:
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                break;
        }
    }

    private final void e(ByteBuffer byteBuffer) {
    }
}
