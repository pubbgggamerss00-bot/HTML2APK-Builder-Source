package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzac extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzaeVar, String str, tg.e eVar) {
        super(2, eVar);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzac(this.zzc, this.zzd, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r7 != r0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        ug.a aVar = ug.a.f29706a;
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e10) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e10.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i10 = 2;
            this.zzb = 2;
            if (e10 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e10).getErrorCode();
                if (errorCode == -100) {
                    i10 = 44;
                } else if (errorCode == -12) {
                    i10 = 39;
                } else if (errorCode == -3) {
                    i10 = 30;
                } else if (errorCode == -2) {
                    i10 = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i10 = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i10 = 53;
                            break;
                        case -17:
                            i10 = 52;
                            break;
                        case -16:
                            i10 = 43;
                            break;
                        case -15:
                            i10 = 42;
                            break;
                        case -14:
                            i10 = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i10 = 36;
                                    break;
                                case -8:
                                    i10 = 35;
                                    break;
                                case -7:
                                    i10 = 34;
                                    break;
                                case -6:
                                    i10 = 33;
                                    break;
                                case -5:
                                    i10 = 32;
                                    break;
                            }
                    }
                } else {
                    i10 = 28;
                }
            } else {
                i10 = 45;
            }
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zzq(i10);
            zztdVarZzf.zzr(15);
            obj = zztdVarZzf.zzk();
            if (obj != aVar) {
                zzyVar = zzaeVar;
            }
            return aVar;
        }
        if (zzenVar == 0) {
            q.b(obj);
            zzen zzenVarZzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzan zzanVar = zzaeVar2.zzc;
            String str = zzaeVar2.zze;
            this.zza = zzenVarZzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzenVarZzb;
        } else {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                q.b(obj);
                int iZza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(iZza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            q.b(obj);
            zzenVar = zzenVar2;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw((String) obj);
        zztfVarZzf.zzf((zzth) zztgVarZzf.zzk());
        return zzz.zza(zzaeVar3, (zzti) zztfVarZzf.zzk());
    }
}
