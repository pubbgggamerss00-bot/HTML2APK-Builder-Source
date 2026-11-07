package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface wf2 {
    ByteBuffer a(int i6);

    ByteBuffer b(int i6);

    void c(int i6, n92 n92Var, long j6);

    void d(Surface surface);

    void e(int i6, int i7, long j6, int i8);

    void f(int i6, long j6);

    boolean g(aa1 aa1Var);

    void h(int i6);

    int i(MediaCodec.BufferInfo bufferInfo);

    void j(int i6);

    void k(Bundle bundle);

    int zza();

    MediaFormat zzc();

    void zzi();

    void zzj();

    void zzm();
}
