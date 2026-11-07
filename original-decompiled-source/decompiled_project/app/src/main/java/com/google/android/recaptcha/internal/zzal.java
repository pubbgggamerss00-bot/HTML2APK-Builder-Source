package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import eh.p;
import kotlin.jvm.internal.g0;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzal extends i implements p {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ g0 zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzan zzanVar, zzen zzenVar, g0 g0Var, tg.e eVar) {
        super(2, eVar);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = g0Var;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzal(this.zzd, this.zze, this.zzf, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (ph.t0.b(r4, r7) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #0 {Exception -> 0x001a, blocks: (B:14:0x0024, B:16:0x0030, B:8:0x0016), top: B:41:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0047 -> B:13:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007a -> B:6:0x0011). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j10;
        boolean z10;
        boolean z11;
        int errorCode;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zzc;
        if (i10 == 0) {
            q.b(obj);
            j10 = 1000;
            z10 = true;
            if (!z10) {
            }
        } else if (i10 != 1) {
            z11 = this.zzb;
            j10 = this.zza;
            q.b(obj);
            z10 = z11;
            j10 += j10;
            if (!z10) {
                return f0.f21461a;
            }
            zzan zzanVar = this.zzd;
            this.zza = j10;
            this.zzc = 1;
            obj = zzanVar.zzi(this);
        } else {
            j10 = this.zza;
            try {
                q.b(obj);
            } catch (Exception e10) {
                this.zzf.f16327a = e10;
                z11 = (e10 instanceof StandardIntegrityException) && ((errorCode = ((StandardIntegrityException) e10).getErrorCode()) == -100 || errorCode == -18 || errorCode == -12 || errorCode == -8 || errorCode == -3);
                if (!z11) {
                    throw e10;
                }
                this.zza = j10;
                this.zzb = true;
                this.zzc = 2;
            }
            this.zzd.zzf().g0((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
            this.zzd.zze = zzao.zzc;
            this.zze.zza();
            z10 = false;
            if (!z10) {
            }
        }
    }
}
