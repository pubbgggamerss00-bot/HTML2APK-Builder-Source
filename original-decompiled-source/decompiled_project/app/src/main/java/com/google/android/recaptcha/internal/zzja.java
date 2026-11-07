package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import e9.w0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.j;
import pg.q;
import ph.h;
import ph.r2;
import ph.u;
import ph.v;
import ph.w;
import qg.x;

/* loaded from: classes2.dex */
public final class zzja extends zze {
    public u zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final j zzk;
    private final j zzl;
    private final j zzm;
    private final j zzn;
    private final j zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zzekVarZza = zzekVar.zza();
        zzekVarZza.zzc(zzekVar.zzd());
        this.zzj = zzekVarZza;
        int i10 = zzav.zza;
        this.zzk = w0.b(zzis.zza);
        this.zzl = w0.b(zzit.zza);
        this.zzm = w0.b(zziu.zza);
        this.zzn = w0.b(zziv.zza);
        this.zzo = w0.b(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzE(zzsc zzscVar, tg.e eVar) {
        zzim zzimVar;
        zzbd e10;
        zzja zzjaVar;
        if (eVar instanceof zzim) {
            zzimVar = (zzim) eVar;
            int i10 = zzimVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzimVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzimVar = new zzim(this, eVar);
            }
        }
        Object objZzd = zzimVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzimVar.zzc;
        if (i11 == 0) {
            q.b(objZzd);
            try {
                zzff zzffVar = (zzff) this.zzn.getValue();
                zzek zzekVar = this.zzj;
                zzimVar.zzd = this;
                zzimVar.zzc = 1;
                objZzd = zzffVar.zzd(zzscVar, zzekVar, zzimVar);
                if (objZzd == aVar) {
                    return aVar;
                }
                zzjaVar = this;
            } catch (zzbd e11) {
                e10 = e11;
                zzjaVar = this;
                zzjaVar.zzA().d0(e10);
                return f0.f21461a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzjaVar = zzimVar.zzd;
            try {
                q.b(objZzd);
            } catch (zzbd e12) {
                e10 = e12;
                zzjaVar.zzA().d0(e10);
                return f0.f21461a;
            }
        }
        h.c(zzjaVar.zzq.zzb(), null, null, new zzin(zzjaVar, (String) objZzd, null), 3);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzF(String str, tg.e eVar) {
        zzio zzioVar;
        Exception exc;
        zzja zzjaVar;
        String str2;
        String str3;
        zzja zzjaVar2;
        zzen zzenVar;
        if (eVar instanceof zzio) {
            zzioVar = (zzio) eVar;
            int i10 = zzioVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzioVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzioVar = new zzio(this, eVar);
            }
        }
        Object obj = zzioVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzioVar.zzc;
        if (i11 == 0) {
            q.b(obj);
            this.zzp = this.zzj.zzf(26);
            try {
                String strZza = ((zzbr) this.zzl.getValue()).zza();
                zzioVar.zzd = this;
                zzioVar.zze = str;
                zzioVar.zzf = strZza;
                zzioVar.zzc = 1;
                Object objZzw = zzw(zzioVar);
                if (objZzw == aVar) {
                    return aVar;
                }
                str2 = str;
                str3 = strZza;
                obj = objZzw;
                zzjaVar2 = this;
                ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
            } catch (Exception e10) {
                exc = e10;
                zzjaVar = this;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                }
                zzjaVar.zzp = null;
                zzjaVar.zzA().d0(zzbdVar);
                return f0.f21461a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = zzioVar.zzf;
            String str5 = zzioVar.zze;
            zzjaVar = zzioVar.zzd;
            try {
                q.b(obj);
                str3 = str4;
                str2 = str5;
                zzjaVar2 = zzjaVar;
            } catch (Exception e11) {
                exc = e11;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar2);
                }
                zzjaVar.zzp = null;
                zzjaVar.zzA().d0(zzbdVar2);
                return f0.f21461a;
            }
            try {
                ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
            } catch (Exception e12) {
                zzjaVar = zzjaVar2;
                exc = e12;
                zzbd zzbdVar22 = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                }
                zzjaVar.zzp = null;
                zzjaVar.zzA().d0(zzbdVar22);
                return f0.f21461a;
            }
        }
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzG(String str, tg.e eVar) {
        zzix zzixVar;
        zzja zzjaVar;
        zzja zzjaVar2;
        if (eVar instanceof zzix) {
            zzixVar = (zzix) eVar;
            int i10 = zzixVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzixVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzixVar = new zzix(this, eVar);
            }
        }
        Object objZzb = zzixVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzixVar.zzc;
        if (i11 == 0) {
            q.b(objZzb);
            zzcb zzcbVar = this.zzg;
            zzje[] zzjeVarArr = {zzje.zzd, zzje.zzc, zzje.zzb};
            zzixVar.zzd = this;
            zzixVar.zze = str;
            zzixVar.zzc = 1;
            objZzb = zzcbVar.zzb(zzjeVarArr, zzixVar);
            if (objZzb != aVar) {
                zzjaVar = this;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zzixVar.zze;
            zzjaVar2 = zzixVar.zzd;
            q.b(objZzb);
            zzjaVar2.zza = w.a();
            zzek zzekVar = zzjaVar2.zzj;
            zzekVar.zzc(str);
            h.c(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar.zzf(42), null), 3);
            return f0.f21461a;
        }
        str = zzixVar.zze;
        zzjaVar = zzixVar.zzd;
        q.b(objZzb);
        if (((Boolean) objZzb).booleanValue()) {
            return f0.f21461a;
        }
        zzcb zzcbVar2 = zzjaVar.zzg;
        zzje zzjeVar = zzje.zzb;
        zzixVar.zzd = zzjaVar;
        zzixVar.zze = str;
        zzixVar.zzc = 2;
        if (zzcbVar2.zzc(zzjeVar, zzixVar) != aVar) {
            zzjaVar2 = zzjaVar;
            zzjaVar2.zza = w.a();
            zzek zzekVar2 = zzjaVar2.zzj;
            zzekVar2.zzc(str);
            h.c(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar2.zzf(42), null), 3);
            return f0.f21461a;
        }
        return aVar;
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final u zzA() {
        u uVar = this.zza;
        if (uVar != null) {
            return uVar;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(x.d0(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, tg.e eVar) {
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        return zzshVarZzf.zzk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[Catch: Exception -> 0x004d, PHI: r2 r11
      0x00c7: PHI (r2v8 ??) = (r2v15 ??), (r2v16 ??) binds: [B:44:0x00c5, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r11v11 java.lang.String) = (r11v10 java.lang.String), (r11v18 java.lang.String) binds: [B:44:0x00c5, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:23:0x0048, B:45:0x00c7, B:43:0x00b7), top: B:56:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.recaptcha.internal.zzja] */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(String str, tg.e eVar) throws Throwable {
        zzip zzipVar;
        zzja zzjaVar;
        zzja zzjaVar2;
        zzja zzjaVar3;
        zzja zzjaVar4;
        u uVarZzA;
        if (eVar instanceof zzip) {
            zzipVar = (zzip) eVar;
            int i10 = zzipVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzipVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzipVar = new zzip(this, eVar);
            }
        }
        Object objZza = zzipVar.zza;
        ug.a aVar = ug.a.f29706a;
        ?? r22 = zzipVar.zzc;
        try {
            if (r22 == 0) {
                q.b(objZza);
                zzcb zzcbVar = this.zzg;
                zzje zzjeVar = zzje.zzd;
                zzipVar.zzd = this;
                zzipVar.zze = str;
                zzipVar.zzc = 1;
                objZza = zzcbVar.zza(zzjeVar, zzipVar);
                if (objZza != aVar) {
                    zzjaVar2 = this;
                }
                return aVar;
            }
            if (r22 != 1) {
                if (r22 == 2) {
                    str = zzipVar.zze;
                    zzja zzjaVar5 = zzipVar.zzd;
                    q.b(objZza);
                    zzjaVar3 = zzjaVar5;
                    zzjaVar4 = zzjaVar3;
                    if (!((Boolean) objZza).booleanValue()) {
                        zzipVar.zzd = zzjaVar3;
                        zzipVar.zze = str;
                        zzipVar.zzc = 3;
                        Object objZzG = zzjaVar3.zzG(str, zzipVar);
                        zzjaVar4 = zzjaVar3;
                        if (objZzG != aVar) {
                        }
                        return aVar;
                    }
                    uVarZzA = zzjaVar4.zzA();
                    zzipVar.zzd = zzjaVar4;
                    zzipVar.zze = str;
                    zzipVar.zzc = 4;
                    r22 = zzjaVar4;
                    if (uVarZzA.await(zzipVar) != aVar) {
                    }
                    return aVar;
                }
                if (r22 == 3) {
                    str = zzipVar.zze;
                    zzja zzjaVar6 = zzipVar.zzd;
                    q.b(objZza);
                    zzjaVar4 = zzjaVar6;
                    uVarZzA = zzjaVar4.zzA();
                    zzipVar.zzd = zzjaVar4;
                    zzipVar.zze = str;
                    zzipVar.zzc = 4;
                    r22 = zzjaVar4;
                    if (uVarZzA.await(zzipVar) != aVar) {
                        v vVarA = w.a();
                        r22.zze.put(str, vVarA);
                        zztp zztpVarZzf = zztq.zzf();
                        zztpVarZzf.zze(str);
                        byte[] bArrZzd = ((zztq) zztpVarZzf.zzk()).zzd();
                        h.c(r22.zzq.zzb(), null, null, new zziq(r22, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3);
                        zzipVar.zzd = r22;
                        zzipVar.zze = str;
                        zzipVar.zzc = 5;
                        objZza = vVarA.k(zzipVar);
                        if (objZza != aVar) {
                        }
                    }
                    return aVar;
                }
                if (r22 != 4) {
                    if (r22 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = zzipVar.zze;
                    zzjaVar = zzipVar.zzd;
                    try {
                        q.b(objZza);
                        zzsi zzsiVar = (zzsi) objZza;
                        zzsh zzshVarZzf = zzsi.zzf();
                        zzshVarZzf.zze(str);
                        zzsl zzslVarZzf = zzsm.zzf();
                        zzslVarZzf.zze(zzsiVar.zzl());
                        zzshVarZzf.zzq(zzslVarZzf);
                        zzsj zzsjVarZzf = zzsk.zzf();
                        zzsjVarZzf.zze(zzsiVar.zzj());
                        zzsjVarZzf.zzf(zzsiVar.zzM());
                        zzshVarZzf.zzr(zzsjVarZzf);
                        return zzshVarZzf.zzk();
                    } catch (Exception e10) {
                        e = e10;
                        zzbd zzbdVarZza = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                        u uVar = (u) zzjaVar.zze.remove(str);
                        if (uVar != null) {
                            uVar.d0(zzbdVarZza);
                        }
                        return q.a(zzbdVarZza);
                    }
                }
                str = zzipVar.zze;
                zzja zzjaVar7 = zzipVar.zzd;
                q.b(objZza);
                r22 = zzjaVar7;
                v vVarA2 = w.a();
                r22.zze.put(str, vVarA2);
                zztp zztpVarZzf2 = zztq.zzf();
                zztpVarZzf2.zze(str);
                byte[] bArrZzd2 = ((zztq) zztpVarZzf2.zzk()).zzd();
                h.c(r22.zzq.zzb(), null, null, new zziq(r22, zzkh.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), null), 3);
                zzipVar.zzd = r22;
                zzipVar.zze = str;
                zzipVar.zzc = 5;
                objZza = vVarA2.k(zzipVar);
                if (objZza != aVar) {
                    zzjaVar = r22;
                    zzsi zzsiVar2 = (zzsi) objZza;
                    zzsh zzshVarZzf2 = zzsi.zzf();
                    zzshVarZzf2.zze(str);
                    zzsl zzslVarZzf2 = zzsm.zzf();
                    zzslVarZzf2.zze(zzsiVar2.zzl());
                    zzshVarZzf2.zzq(zzslVarZzf2);
                    zzsj zzsjVarZzf2 = zzsk.zzf();
                    zzsjVarZzf2.zze(zzsiVar2.zzj());
                    zzsjVarZzf2.zzf(zzsiVar2.zzM());
                    zzshVarZzf2.zzr(zzsjVarZzf2);
                    return zzshVarZzf2.zzk();
                }
                return aVar;
            }
            str = zzipVar.zze;
            zzja zzjaVar8 = zzipVar.zzd;
            q.b(objZza);
            zzjaVar2 = zzjaVar8;
            if (((Boolean) objZza).booleanValue()) {
                return q.a(new zzbd(zzbb.zzb, zzba.zzav, null));
            }
            zzcb zzcbVar2 = zzjaVar2.zzg;
            zzje zzjeVar2 = zzje.zzc;
            zzipVar.zzd = zzjaVar2;
            zzipVar.zze = str;
            zzipVar.zzc = 2;
            objZza = zzcbVar2.zza(zzjeVar2, zzipVar);
            zzjaVar3 = zzjaVar2;
            if (objZza != aVar) {
                zzjaVar4 = zzjaVar3;
                if (!((Boolean) objZza).booleanValue()) {
                }
                uVarZzA = zzjaVar4.zzA();
                zzipVar.zzd = zzjaVar4;
                zzipVar.zze = str;
                zzipVar.zzc = 4;
                r22 = zzjaVar4;
                if (uVarZzA.await(zzipVar) != aVar) {
                }
            }
            return aVar;
        } catch (Exception e11) {
            e = e11;
            zzjaVar = r22;
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(zzbd zzbdVar, tg.e eVar) {
        if (r.a(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return f0.f21461a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(zzsc zzscVar, tg.e eVar) {
        zzir zzirVar;
        if (eVar instanceof zzir) {
            zzirVar = (zzir) eVar;
            int i10 = zzirVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzirVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzirVar = new zzir(this, eVar);
            }
        }
        Object obj = zzirVar.zza;
        Object obj2 = ug.a.f29706a;
        int i11 = zzirVar.zzc;
        if (i11 != 0) {
            if (i11 == 1) {
                q.b(obj);
                return q.a(new zzbd(zzbb.zzb, zzba.zzav, null));
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            return f0.f21461a;
        }
        q.b(obj);
        if (zzscVar.zzT() && zzscVar.zzR() && zzscVar.zzQ()) {
            this.zzf = zzscVar;
            String strZzd = this.zzc.zzd();
            zzirVar.zzc = 2;
        } else {
            zzcb zzcbVar = this.zzg;
            zzje zzjeVar = zzje.zzd;
            zzirVar.zzc = 1;
        }
        return obj2;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(String str, long j10, Exception exc, tg.e eVar) {
        exc.getMessage();
        u uVar = (u) this.zze.remove(str);
        if (uVar != null) {
            uVar.d0(exc);
        }
        return f0.f21461a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(Exception exc, tg.e eVar) {
        return ((exc instanceof r2) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(tg.e eVar) {
        return h.e(this.zzq.zzb().getCoroutineContext(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), eVar);
    }

    public final Object zzx(tg.e eVar) throws Throwable {
        Object objE = h.e(this.zzq.zzb().getCoroutineContext(), new zzil(this, null), eVar);
        return objE == ug.a.f29706a ? objE : f0.f21461a;
    }
}
