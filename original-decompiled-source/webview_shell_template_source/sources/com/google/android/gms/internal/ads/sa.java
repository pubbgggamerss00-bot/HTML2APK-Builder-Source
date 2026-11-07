package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sa implements ra {
    public final FileChannel s;

    /* renamed from: t, reason: collision with root package name */
    public final long f8861t;

    /* renamed from: u, reason: collision with root package name */
    public final long f8862u;

    public sa(FileChannel fileChannel, long j6, long j7) {
        this.s = fileChannel;
        this.f8861t = j6;
        this.f8862u = j7;
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final void a(MessageDigest[] messageDigestArr, long j6, int i6) throws IOException {
        MappedByteBuffer map = this.s.map(FileChannel.MapMode.READ_ONLY, this.f8861t + j6, i6);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final long zza() {
        return this.f8862u;
    }
}
