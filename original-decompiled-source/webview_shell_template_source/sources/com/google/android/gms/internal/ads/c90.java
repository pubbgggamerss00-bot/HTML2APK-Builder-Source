package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c90 {

    /* renamed from: a, reason: collision with root package name */
    public long f3473a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.s92] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.s92] */
    public final long a(ByteBuffer byteBuffer) {
        vc vcVar;
        uc ucVar;
        long j6 = this.f3473a;
        if (j6 > 0) {
            return j6;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            rc rcVar = new rc(new b90(byteBufferDuplicate), f90.f4564c);
            ArrayList s92Var = rcVar.f7662x;
            if (rcVar.f7658t != null && rcVar.f7659u != o92.f7657y) {
                s92Var = new s92(s92Var, rcVar);
            }
            Iterator it = s92Var.iterator();
            while (true) {
                vcVar = null;
                if (!it.hasNext()) {
                    ucVar = null;
                    break;
                }
                sc scVar = (sc) it.next();
                if (scVar instanceof uc) {
                    ucVar = (uc) scVar;
                    break;
                }
            }
            ArrayList s92Var2 = ucVar.f7662x;
            if (ucVar.f7658t != null && ucVar.f7659u != o92.f7657y) {
                s92Var2 = new s92(s92Var2, ucVar);
            }
            Iterator it2 = s92Var2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                sc scVar2 = (sc) it2.next();
                if (scVar2 instanceof vc) {
                    vcVar = (vc) scVar2;
                    break;
                }
            }
            long j7 = (vcVar.E * 1000) / vcVar.D;
            this.f3473a = j7;
            return j7;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
