package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xx1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r32 f10742a = r32.a(new byte[0]);

    public static final r32 a(int i6) {
        return r32.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i6).array());
    }

    public static final r32 b(int i6) {
        return r32.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i6).array());
    }
}
