package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;
import ph.h;
import ph.i0;
import ph.p0;
import ph.u;
import ph.w;

/* loaded from: classes2.dex */
public final class zzan {
    public u zza;
    private final i0 zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final yh.a zzg = new yh.c();

    public zzan(Context context, i0 i0Var, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j10) {
        this.zzb = i0Var;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(tg.e eVar) throws Exception {
        zzag zzagVar;
        if (eVar instanceof zzag) {
            zzagVar = (zzag) eVar;
            int i10 = zzagVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzagVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzagVar = new zzag(this, eVar);
            }
        }
        Object obj = zzagVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzagVar.zzc;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            return obj;
        }
        q.b(obj);
        p0 p0VarZza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
        zzagVar.zzc = 1;
        Object objAwait = p0VarZza.await(zzagVar);
        return objAwait == aVar ? aVar : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, tg.e eVar) throws Exception {
        zzah zzahVar;
        if (eVar instanceof zzah) {
            zzahVar = (zzah) eVar;
            int i10 = zzahVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzahVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzahVar = new zzah(this, eVar);
            }
        }
        Object objAwait = zzahVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzahVar.zzc;
        if (i11 == 0) {
            q.b(objAwait);
            u uVarZzf = zzf();
            zzahVar.zzd = str;
            zzahVar.zzc = 1;
            objAwait = uVarZzf.await(zzahVar);
            if (objAwait != aVar) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(objAwait);
            return ((StandardIntegrityManager.StandardIntegrityToken) objAwait).token();
        }
        str = zzahVar.zzd;
        q.b(objAwait);
        p0 p0VarZza = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) objAwait).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzahVar.zzd = null;
        zzahVar.zzc = 2;
        objAwait = p0VarZza.await(zzahVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[PHI: r2 r7
      0x0067: PHI (r2v6 com.google.android.recaptcha.internal.zzan) = (r2v3 com.google.android.recaptcha.internal.zzan), (r2v8 com.google.android.recaptcha.internal.zzan) binds: [B:29:0x0064, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r7v4 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:29:0x0064, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, tg.e eVar) throws Exception {
        zzaf zzafVar;
        zzan zzanVar;
        if (eVar instanceof zzaf) {
            zzafVar = (zzaf) eVar;
            int i10 = zzafVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzafVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzafVar = new zzaf(this, eVar);
            }
        }
        Object objZzj = zzafVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzafVar.zzc;
        if (i11 == 0) {
            q.b(objZzj);
            try {
                zzafVar.zzd = this;
                zzafVar.zze = str;
                zzafVar.zzc = 1;
                objZzj = zzj(str, zzafVar);
                if (objZzj != aVar) {
                    zzanVar = this;
                }
            } catch (Exception unused) {
                zzanVar = this;
                zzafVar.zzd = zzanVar;
                zzafVar.zze = str;
                zzafVar.zzc = 2;
                if (zzanVar.zze(zzafVar) != aVar) {
                }
                return aVar;
            }
            return aVar;
        }
        if (i11 == 1) {
            str = zzafVar.zze;
            zzanVar = zzafVar.zzd;
            try {
                q.b(objZzj);
            } catch (Exception unused2) {
                zzafVar.zzd = zzanVar;
                zzafVar.zze = str;
                zzafVar.zzc = 2;
                if (zzanVar.zze(zzafVar) != aVar) {
                    zzafVar.zzd = null;
                    zzafVar.zze = null;
                    zzafVar.zzc = 3;
                    objZzj = zzanVar.zzj(str, zzafVar);
                }
                return aVar;
            }
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(objZzj);
                return (String) objZzj;
            }
            str = zzafVar.zze;
            zzanVar = zzafVar.zzd;
            q.b(objZzj);
            zzafVar.zzd = null;
            zzafVar.zze = null;
            zzafVar.zzc = 3;
            objZzj = zzanVar.zzj(str, zzafVar);
        }
        return (String) objZzj;
    }

    public final Object zzd(long j10, tg.e eVar) {
        this.zzf = j10;
        return f0.f21461a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (pg.f0.f21461a == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(tg.e eVar) {
        zzak zzakVar;
        yh.a aVar;
        zzan zzanVar;
        if (eVar instanceof zzak) {
            zzakVar = (zzak) eVar;
            int i10 = zzakVar.zzd;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzakVar.zzd = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzakVar = new zzak(this, eVar);
            }
        }
        Object obj = zzakVar.zzb;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = zzakVar.zzd;
        try {
            if (i11 == 0) {
                q.b(obj);
                aVar = this.zzg;
                zzakVar.zze = this;
                zzakVar.zza = aVar;
                zzakVar.zzd = 1;
                if (aVar.h(zzakVar) != aVar2) {
                    zzanVar = this;
                }
                return aVar2;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
                return f0.f21461a;
            }
            aVar = (yh.a) zzakVar.zza;
            zzanVar = zzakVar.zze;
            q.b(obj);
            if (!r.a(zzanVar.zze, zzao.zza)) {
                return f0.f21461a;
            }
            zzanVar.zze = zzao.zzb;
            f0 f0Var = f0.f21461a;
            aVar.l(null);
            zzek zzekVar = zzanVar.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzekVar.zzb(2);
            zzen zzenVarZzf = zzekVar.zzf(38);
            zzanVar.zza = w.a();
            h.c(zzanVar.zzb, null, null, new zzam(zzanVar, zzenVarZzf, null), 3);
            zzakVar.zze = null;
            zzakVar.zza = null;
            zzakVar.zzd = 2;
            if (!zzanVar.zzh) {
                new Timer().schedule(new zzai(zzanVar), 28800000L, 28800000L);
                zzanVar.zzh = true;
            }
        } finally {
            aVar.l(null);
        }
    }

    public final u zzf() {
        u uVar = this.zza;
        if (uVar != null) {
            return uVar;
        }
        return null;
    }
}
