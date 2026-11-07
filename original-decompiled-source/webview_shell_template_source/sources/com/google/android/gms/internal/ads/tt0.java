package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tt0 {
    public static void a(MediaFormat mediaFormat, String str, int i6) {
        if (i6 != -1) {
            mediaFormat.setInteger(str, i6);
        }
    }

    public static void b(MediaFormat mediaFormat, List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            mediaFormat.setByteBuffer(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "csd-"), ByteBuffer.wrap((byte[]) list.get(i6)));
        }
    }
}
