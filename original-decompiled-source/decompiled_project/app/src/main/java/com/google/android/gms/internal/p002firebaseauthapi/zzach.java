package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import id.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import qd.a;
import qd.a0;
import qd.b0;
import qd.c;
import qd.d;
import qd.d0;
import qd.h0;
import qd.p;
import qd.q;
import qd.x;
import qd.z;
import rd.c0;
import rd.g;
import rd.i;
import rd.l;
import rd.t;
import rd.u;
import rd.u0;
import rd.w0;

/* loaded from: classes2.dex */
public final class zzach extends zzafg {
    public zzach(e eVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaef(eVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(e eVar, String str, String str2) {
        return zza((zzack) new zzack(str, str2).zza(eVar));
    }

    public final Task<Object> zzb(e eVar, String str, String str2) {
        return zza((zzacj) new zzacj(str, str2).zza(eVar));
    }

    public final Task<Object> zzc(e eVar, String str, String str2) {
        return zza((zzacn) new zzacn(str, str2).zza(eVar));
    }

    public final Task<Void> zzd(e eVar, p pVar, String str, u0 u0Var) {
        return zza((zzadx) new zzadx(str).zza(eVar).zza(pVar).zza((zzaex<Void, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(e eVar, String str, String str2, String str3) {
        return zza((zzacm) new zzacm(str, str2, str3).zza(eVar));
    }

    public final Task<Void> zzb(e eVar, String str, a aVar, String str2, String str3) {
        aVar.f22653j = 6;
        return zza((zzadk) new zzadk(str, aVar, str2, str3, "sendSignInLinkToEmail").zza(eVar));
    }

    public final Task<Object> zzc(e eVar, p pVar, c cVar, String str, u0 u0Var) {
        return zza((zzada) new zzada(cVar, str).zza(eVar).zza(pVar).zza((zzaex<Object, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Object> zza(e eVar, String str, String str2, String str3, String str4, w0 w0Var) {
        return zza((zzacl) new zzacl(str, str2, str3, str4).zza(eVar).zza((zzaex<Object, w0>) w0Var));
    }

    public final Task<String> zzd(e eVar, String str, String str2) {
        return zza((zzaeb) new zzaeb(str, str2).zza(eVar));
    }

    public final Task<Void> zzb(e eVar, p pVar, c cVar, String str, u0 u0Var) {
        return zza((zzacx) new zzacx(cVar, str).zza(eVar).zza(pVar).zza((zzaex<Void, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zzc(e eVar, p pVar, String str, u0 u0Var) {
        return zza((zzady) new zzady(str).zza(eVar).zza(pVar).zza((zzaex<Void, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(p pVar, u uVar) {
        return zza((zzaco) new zzaco().zza(pVar).zza((zzaex<Void, u>) uVar).zza((t) uVar));
    }

    public final Task<Object> zzb(e eVar, p pVar, d dVar, String str, u0 u0Var) {
        return zza((zzadc) new zzadc(dVar, str).zza(eVar).zza(pVar).zza((zzaex<Object, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(e eVar, a0 a0Var, p pVar, String str, w0 w0Var) {
        zzaft.zza();
        zzacq zzacqVar = new zzacq(a0Var, pVar.zze(), str, null);
        zzacqVar.zza(eVar).zza((zzaex<Void, w0>) w0Var);
        return zza(zzacqVar);
    }

    public final Task<Object> zzb(e eVar, p pVar, String str, String str2, String str3, String str4, u0 u0Var) {
        return zza((zzade) new zzade(str, str2, str3, str4).zza(eVar).zza(pVar).zza((zzaex<Object, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(e eVar, d0 d0Var, p pVar, String str, String str2, w0 w0Var) {
        zzacq zzacqVar = new zzacq(d0Var, pVar.zze(), str, str2);
        zzacqVar.zza(eVar).zza((zzaex<Void, w0>) w0Var);
        return zza(zzacqVar);
    }

    public final Task<Object> zza(e eVar, p pVar, a0 a0Var, String str, w0 w0Var) {
        zzaft.zza();
        zzacp zzacpVar = new zzacp(a0Var, str, null);
        zzacpVar.zza(eVar).zza((zzaex<Object, w0>) w0Var);
        if (pVar != null) {
            zzacpVar.zza(pVar);
        }
        return zza(zzacpVar);
    }

    public final Task<Object> zzb(e eVar, p pVar, x xVar, String str, u0 u0Var) {
        zzaft.zza();
        return zza((zzadg) new zzadg(xVar, str).zza(eVar).zza(pVar).zza((zzaex<Object, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Object> zza(e eVar, p pVar, d0 d0Var, String str, String str2, w0 w0Var) {
        zzacp zzacpVar = new zzacp(d0Var, str, str2);
        zzacpVar.zza(eVar).zza((zzaex<Object, w0>) w0Var);
        if (pVar != null) {
            zzacpVar.zza(pVar);
        }
        return zza(zzacpVar);
    }

    public final Task<Object> zzb(e eVar, String str, String str2, String str3, String str4, w0 w0Var) {
        return zza((zzadn) new zzadn(str, str2, str3, str4).zza(eVar).zza((zzaex<Object, w0>) w0Var));
    }

    public final Task<Void> zza(e eVar, String str, a aVar, String str2, String str3) {
        aVar.f22653j = 1;
        return zza((zzadk) new zzadk(str, aVar, str2, str3, "sendPasswordResetEmail").zza(eVar));
    }

    public final Task<Object> zzb(e eVar, p pVar, String str, u0 u0Var) {
        com.google.android.gms.common.internal.p.f(eVar);
        com.google.android.gms.common.internal.p.d(str);
        com.google.android.gms.common.internal.p.f(pVar);
        com.google.android.gms.common.internal.p.f(u0Var);
        List<String> listT = pVar.t();
        if ((listT != null && !listT.contains(str)) || pVar.k()) {
            return Tasks.forException(zzaei.zza(new Status(17016, str, null, null)));
        }
        str.getClass();
        if (!str.equals("password")) {
            return zza((zzadv) new zzadv(str).zza(eVar).zza(pVar).zza((zzaex<Object, w0>) u0Var).zza((t) u0Var));
        }
        return zza((zzadw) new zzadw().zza(eVar).zza(pVar).zza((zzaex<Object, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(String str, String str2, a aVar) {
        aVar.f22653j = 7;
        return zza(new zzaec(str, str2, aVar));
    }

    public final Task<q> zza(e eVar, p pVar, String str, u0 u0Var) {
        return zza((zzacs) new zzacs(str).zza(eVar).zza(pVar).zza((zzaex<q, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<zzahj> zza() {
        return zza(new zzacr());
    }

    public final Task<zzahk> zza(String str, String str2) {
        return zza(new zzacu(str, str2));
    }

    public final Task<Object> zza(e eVar, p pVar, c cVar, String str, u0 u0Var) {
        com.google.android.gms.common.internal.p.f(eVar);
        com.google.android.gms.common.internal.p.f(cVar);
        com.google.android.gms.common.internal.p.f(pVar);
        com.google.android.gms.common.internal.p.f(u0Var);
        List<String> listT = pVar.t();
        if (listT != null && listT.contains(cVar.d())) {
            return Tasks.forException(zzaei.zza(new Status(17015, null, null, null)));
        }
        if (cVar instanceof d) {
            d dVar = (d) cVar;
            if (TextUtils.isEmpty(dVar.f22667c)) {
                return zza((zzact) new zzact(dVar, str).zza(eVar).zza(pVar).zza((zzaex<Object, w0>) u0Var).zza((t) u0Var));
            }
            return zza((zzacy) new zzacy(dVar).zza(eVar).zza(pVar).zza((zzaex<Object, w0>) u0Var).zza((t) u0Var));
        }
        if (cVar instanceof x) {
            zzaft.zza();
            return zza((zzacv) new zzacv((x) cVar).zza(eVar).zza(pVar).zza((zzaex<Object, w0>) u0Var).zza((t) u0Var));
        }
        return zza((zzacw) new zzacw(cVar).zza(eVar).zza(pVar).zza((zzaex<Object, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(e eVar, p pVar, d dVar, String str, u0 u0Var) {
        return zza((zzacz) new zzacz(dVar, str).zza(eVar).zza(pVar).zza((zzaex<Void, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(e eVar, p pVar, String str, String str2, String str3, String str4, u0 u0Var) {
        return zza((zzadb) new zzadb(str, str2, str3, str4).zza(eVar).zza(pVar).zza((zzaex<Void, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(e eVar, p pVar, x xVar, String str, u0 u0Var) {
        zzaft.zza();
        return zza((zzadd) new zzadd(xVar, str).zza(eVar).zza(pVar).zza((zzaex<Void, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(e eVar, p pVar, u0 u0Var) {
        return zza((zzadf) new zzadf().zza(eVar).zza(pVar).zza((zzaex<Void, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzadi(str, str2, str3, str4));
    }

    public final Task<Void> zza(e eVar, a aVar, String str) {
        return zza((zzadh) new zzadh(str, aVar).zza(eVar));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzadj(str));
    }

    public final Task<Object> zza(e eVar, w0 w0Var, String str) {
        return zza((zzadm) new zzadm(str).zza(eVar).zza((zzaex<Object, w0>) w0Var));
    }

    public final Task<Object> zza(e eVar, c cVar, String str, w0 w0Var) {
        return zza((zzadl) new zzadl(cVar, str).zza(eVar).zza((zzaex<Object, w0>) w0Var));
    }

    public final Task<Object> zza(e eVar, String str, String str2, w0 w0Var) {
        return zza((zzado) new zzado(str, str2).zza(eVar).zza((zzaex<Object, w0>) w0Var));
    }

    public final Task<Object> zza(e eVar, d dVar, String str, w0 w0Var) {
        return zza((zzadq) new zzadq(dVar, str).zza(eVar).zza((zzaex<Object, w0>) w0Var));
    }

    public final Task<Object> zza(e eVar, x xVar, String str, w0 w0Var) {
        zzaft.zza();
        return zza((zzadp) new zzadp(xVar, str).zza(eVar).zza((zzaex<Object, w0>) w0Var));
    }

    public final Task<Void> zza(l lVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, String str5, boolean z12, z zVar, Executor executor, Activity activity) {
        zzads zzadsVar = new zzads(lVar, str, str2, j10, z10, z11, str3, str4, str5, z12);
        zzadsVar.zza(zVar, activity, executor, str);
        return zza(zzadsVar);
    }

    public final Task<zzaij> zza(l lVar, String str) {
        return zza(new zzadr(lVar, str));
    }

    public final Task<Void> zza(l lVar, b0 b0Var, String str, long j10, boolean z10, boolean z11, String str2, String str3, String str4, boolean z12, z zVar, Executor executor, Activity activity) {
        String str5 = lVar.f23398b;
        com.google.android.gms.common.internal.p.d(str5);
        zzadu zzaduVar = new zzadu(b0Var, str5, str, j10, z10, z11, str2, str3, str4, z12);
        zzaduVar.zza(zVar, activity, executor, b0Var.f22659a);
        return zza(zzaduVar);
    }

    public final Task<Void> zza(e eVar, p pVar, String str, String str2, u0 u0Var) {
        return zza((zzadt) new zzadt(pVar.zze(), str, str2).zza(eVar).zza(pVar).zza((zzaex<Void, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(e eVar, p pVar, x xVar, u0 u0Var) {
        zzaft.zza();
        return zza((zzaea) new zzaea(xVar).zza(eVar).zza(pVar).zza((zzaex<Void, w0>) u0Var).zza((t) u0Var));
    }

    public final Task<Void> zza(e eVar, p pVar, h0 h0Var, u0 u0Var) {
        return zza((zzadz) new zzadz(h0Var).zza(eVar).zza(pVar).zza((zzaex<Void, w0>) u0Var).zza((t) u0Var));
    }

    public static g zza(e eVar, zzahc zzahcVar) {
        com.google.android.gms.common.internal.p.f(eVar);
        com.google.android.gms.common.internal.p.f(zzahcVar);
        ArrayList arrayList = new ArrayList();
        rd.d dVar = new rd.d();
        com.google.android.gms.common.internal.p.d("firebase");
        String strZzi = zzahcVar.zzi();
        com.google.android.gms.common.internal.p.d(strZzi);
        dVar.f23349a = strZzi;
        dVar.f23350b = "firebase";
        dVar.f23354f = zzahcVar.zzh();
        dVar.f23351c = zzahcVar.zzg();
        Uri uriZzc = zzahcVar.zzc();
        if (uriZzc != null) {
            dVar.f23352d = uriZzc.toString();
            dVar.f23353e = uriZzc;
        }
        dVar.f23356h = zzahcVar.zzm();
        dVar.f23357j = null;
        dVar.f23355g = zzahcVar.zzj();
        arrayList.add(dVar);
        List<zzaht> listZzl = zzahcVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i10 = 0; i10 < listZzl.size(); i10++) {
                zzaht zzahtVar = listZzl.get(i10);
                rd.d dVar2 = new rd.d();
                com.google.android.gms.common.internal.p.f(zzahtVar);
                dVar2.f23349a = zzahtVar.zzd();
                String strZzf = zzahtVar.zzf();
                com.google.android.gms.common.internal.p.d(strZzf);
                dVar2.f23350b = strZzf;
                dVar2.f23351c = zzahtVar.zzb();
                Uri uriZza = zzahtVar.zza();
                if (uriZza != null) {
                    dVar2.f23352d = uriZza.toString();
                    dVar2.f23353e = uriZza;
                }
                dVar2.f23354f = zzahtVar.zzc();
                dVar2.f23355g = zzahtVar.zze();
                dVar2.f23356h = false;
                dVar2.f23357j = zzahtVar.zzg();
                arrayList.add(dVar2);
            }
        }
        g gVar = new g(eVar, arrayList);
        gVar.f23373j = new i(zzahcVar.zzb(), zzahcVar.zza());
        gVar.f23374k = zzahcVar.zzn();
        gVar.f23375l = zzahcVar.zze();
        gVar.r(c0.a(zzahcVar.zzk()));
        gVar.p(zzahcVar.zzd());
        return gVar;
    }

    public final void zza(e eVar, zzaib zzaibVar, z zVar, Activity activity, Executor executor) {
        zza((zzaee) new zzaee(zzaibVar).zza(eVar).zza(zVar, activity, executor, zzaibVar.zzd()));
    }
}
