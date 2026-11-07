package com.google.android.recaptcha.internal;

import a9.c2;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import e9.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.r;
import lh.g;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.j;
import pg.p;
import pg.q;
import ph.h;
import ph.r2;
import ph.s1;
import ph.u2;
import ph.v1;
import qg.j0;
import qg.x;

/* loaded from: classes2.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final j zzd;
    private final j zze;
    private final j zzf;
    private final j zzg;
    private final j zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i10 = zzav.zza;
        this.zzd = w0.b(zzdm.zza);
        this.zze = w0.b(zzdn.zza);
        this.zzf = w0.b(zzdo.zza);
        this.zzg = w0.b(zzdp.zza);
        this.zzh = w0.b(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zzekVarZza = this.zzb.zza();
        zzekVarZza.zzc(str);
        return zzekVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(zzsc zzscVar, long j10, tg.e eVar) throws Throwable {
        zzdj zzdjVar;
        Object objZzc;
        zzdt zzdtVar;
        g<s1> children;
        if (eVar instanceof zzdj) {
            zzdjVar = (zzdj) eVar;
            int i10 = zzdjVar.zzd;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzdjVar.zzd = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzdjVar = new zzdj(this, eVar);
            }
        }
        zzdj zzdjVar2 = zzdjVar;
        Object obj = zzdjVar2.zzb;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzdjVar2.zzd;
        if (i11 == 0) {
            q.b(obj);
            zzy(zzscVar.zzO());
            Iterator it = zzw().iterator();
            while (it.hasNext()) {
                this.zzc.zzf((zze) it.next());
            }
            zzl zzlVar = this.zzc;
            zzek zzekVar = this.zzb;
            zzdjVar2.zza = this;
            zzdjVar2.zzd = 1;
            objZzc = zzlVar.zzc(j10, zzscVar, zzekVar, zzdjVar2);
            if (objZzc != aVar) {
                zzdtVar = this;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th2 = (Throwable) zzdjVar2.zza;
            q.b(obj);
            throw th2;
        }
        zzdtVar = (zzdt) zzdjVar2.zza;
        q.b(obj);
        objZzc = ((p) obj).f21471a;
        Throwable thA = p.a(objZzc);
        if (thA == null) {
            return f0.f21461a;
        }
        s1 s1Var = (s1) zzdtVar.zzi.zzd().getCoroutineContext().get(s1.a.f21589a);
        if (s1Var != null && (children = s1Var.getChildren()) != null) {
            Iterator<s1> it2 = children.iterator();
            while (it2.hasNext()) {
                it2.next().cancel((CancellationException) null);
            }
        }
        List listK = lh.j.k(v1.f(zzdtVar.zzi.zzd().getCoroutineContext()).getChildren());
        zzdjVar2.zza = thA;
        zzdjVar2.zzd = 2;
        if (c2.b(listK, zzdjVar2) != aVar) {
            throw thA;
        }
        return aVar;
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return x.c0(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i10 = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            r.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) throws zzbd {
        try {
            zzrv zzrvVarZzj = zzrv.zzj(zzbt.zza(str));
            int i10 = zzav.zza;
            ((zzfu) w0.b(zzde.zza).getValue()).zza(zzrvVarZzj);
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e10.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzsoVarZzf = zzsp.zzf();
        zzsoVarZzf.zzs(this.zza);
        zzsoVarZzf.zze(recaptchaAction.getAction());
        zzsoVarZzf.zzf(zzscVar.zzN());
        zzsoVarZzf.zzq(zzscVar.zzM());
        zzsoVarZzf.zzr(zzsiVar);
        return (zzsp) zzsoVarZzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(String str, long j10, tg.e eVar) throws zzbd {
        zzdd zzddVar;
        Exception e10;
        zzen zzenVar;
        r2 e11;
        zzbd e12;
        if (eVar instanceof zzdd) {
            zzddVar = (zzdd) eVar;
            int i10 = zzddVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzddVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzddVar = new zzdd(this, eVar);
            }
        }
        Object obj = zzddVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzddVar.zzc;
        if (i11 == 0) {
            q.b(obj);
            zzen zzenVarZzf = zzu(str).zzf(27);
            try {
                zzl zzlVar = this.zzc;
                zzddVar.zzd = zzenVarZzf;
                zzddVar.zzc = 1;
                Object objZzb = zzlVar.zzb(str, j10, zzddVar);
                if (objZzb == aVar) {
                    return aVar;
                }
                obj = objZzb;
                zzenVar = zzenVarZzf;
            } catch (zzbd e13) {
                e12 = e13;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e12);
                throw e12;
            } catch (r2 e14) {
                e11 = e14;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzb, e11.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar;
            } catch (Exception e15) {
                e10 = e15;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzaa, e10.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzddVar.zzd;
            try {
                q.b(obj);
            } catch (zzbd e16) {
                e12 = e16;
                zzenVar.zzb(e12);
                throw e12;
            } catch (r2 e17) {
                e11 = e17;
                zzbd zzbdVar3 = new zzbd(zzbb.zzb, zzba.zzb, e11.getMessage());
                zzenVar.zzb(zzbdVar3);
                throw zzbdVar3;
            } catch (Exception e18) {
                e10 = e18;
                zzbd zzbdVar22 = new zzbd(zzbb.zzb, zzba.zzaa, e10.getMessage());
                zzenVar.zzb(zzbdVar22);
                throw zzbdVar22;
            }
        }
        zzsi zzsiVar = (zzsi) obj;
        zzenVar.zza();
        return zzsiVar;
    }

    public final Object zzm(zzsp zzspVar, String str, long j10, tg.e eVar) {
        return h.e(this.zzi.zza().getCoroutineContext(), new zzdg(this, str, j10, zzspVar, null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzn(zzsc zzscVar, long j10, tg.e eVar) throws zzbd {
        zzdk zzdkVar;
        if (eVar instanceof zzdk) {
            zzdkVar = (zzdk) eVar;
            int i10 = zzdkVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzdkVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzdkVar = new zzdk(this, eVar);
            }
        }
        Object obj = zzdkVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzdkVar.zzc;
        try {
            if (i11 == 0) {
                q.b(obj);
                zzdl zzdlVar = new zzdl(this, zzscVar, j10, null);
                zzdkVar.zzc = 1;
                if (u2.b(j10, zzdlVar, zzdkVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return f0.f21461a;
        } catch (zzbd e10) {
            throw e10;
        } catch (r2 e11) {
            throw new zzbd(zzbb.zzb, zzba.zzb, e11.getMessage());
        } catch (Exception e12) {
            throw new zzbd(zzbb.zzb, zzba.zzap, e12.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzo(long j10, tg.e eVar) throws zzbd {
        zzdr zzdrVar;
        Exception e10;
        zzen zzenVar;
        zzdt zzdtVar;
        r2 e11;
        zzbd e12;
        if (eVar instanceof zzdr) {
            zzdrVar = (zzdr) eVar;
            int i10 = zzdrVar.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zzdrVar.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zzdrVar = new zzdr(this, eVar);
            }
        }
        Object obj = zzdrVar.zza;
        ug.a aVar = ug.a.f29706a;
        int i11 = zzdrVar.zzc;
        if (i11 == 0) {
            q.b(obj);
            zzen zzenVarZzf = this.zzb.zzf(22);
            try {
                zzds zzdsVar = new zzds(this, zzenVarZzf, null);
                zzdrVar.zzd = this;
                zzdrVar.zze = zzenVarZzf;
                zzdrVar.zzc = 1;
                Object objB = u2.b(j10, zzdsVar, zzdrVar);
                if (objB == aVar) {
                    return aVar;
                }
                obj = objB;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
            } catch (zzbd e13) {
                e12 = e13;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                if (r.a(e12.zzb(), zzbb.zzc)) {
                }
                zzenVar.zzb(e12);
                throw e12;
            } catch (r2 e14) {
                e11 = e14;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                zzbd zzbdVarZzs = zzdtVar.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (Exception e15) {
                e10 = e15;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                zzbd zzbdVarZzs2 = zzdtVar.zzs(e10, new zzbd(zzbb.zzc, zzba.zzaw, e10.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzdrVar.zze;
            zzdtVar = zzdrVar.zzd;
            try {
                q.b(obj);
            } catch (zzbd e16) {
                e12 = e16;
                if (r.a(e12.zzb(), zzbb.zzc)) {
                    e12 = zzdtVar.zzs(e12, e12);
                }
                zzenVar.zzb(e12);
                throw e12;
            } catch (r2 e17) {
                e11 = e17;
                zzbd zzbdVarZzs3 = zzdtVar.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            } catch (Exception e18) {
                e10 = e18;
                zzbd zzbdVarZzs22 = zzdtVar.zzs(e10, new zzbd(zzbb.zzc, zzba.zzaw, e10.getMessage()));
                zzenVar.zzb(zzbdVarZzs22);
                throw zzbdVarZzs22;
            }
        }
        return (zzsc) obj;
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzenVarZzf = zzu(str).zzf(29);
        try {
            List<zzst> listZzk = zzsrVar.zzk();
            int iA = j0.a(qg.p.h(listZzk, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (zzst zzstVar : listZzk) {
                linkedHashMap.put(zzstVar.zzg(), zzstVar.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzenVarZzf.zza();
        } catch (zzbd e10) {
            zzenVarZzf.zzb(e10);
        } catch (Exception e11) {
            zzenVarZzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e11.getMessage()));
        }
    }
}
