package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import k8.c;
import qd.u;
import rd.c0;
import rd.w0;

/* loaded from: classes2.dex */
final class zzacj extends zzaex<Object, w0> {
    private final String zzu;
    private final String zzv;

    public zzacj(String str, String str2) {
        super(4);
        p.e(str, "code cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "checkActionCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        char c10;
        zzahx zzahxVar = this.zzm;
        c cVar = new c();
        if (zzahxVar.zzg()) {
            zzahxVar.zzc();
        } else {
            zzahxVar.zzb();
        }
        zzahxVar.zzb();
        if (zzahxVar.zzh()) {
            String strZzd = zzahxVar.zzd();
            strZzd.getClass();
            c10 = 5;
            switch (strZzd) {
                case "REVERT_SECOND_FACTOR_ADDITION":
                    c10 = 6;
                    break;
                case "PASSWORD_RESET":
                    c10 = 0;
                    break;
                case "VERIFY_EMAIL":
                    c10 = 1;
                    break;
                case "VERIFY_AND_CHANGE_EMAIL":
                    break;
                case "EMAIL_SIGNIN":
                    c10 = 4;
                    break;
                case "RECOVER_EMAIL":
                    c10 = 2;
                    break;
                default:
                    c10 = 3;
                    break;
            }
            if (c10 != 4 && c10 != 3) {
                if (zzahxVar.zzf()) {
                    String strZzb = zzahxVar.zzb();
                    u uVarB = c0.b(zzahxVar.zza());
                    p.d(strZzb);
                    p.f(uVarB);
                } else if (zzahxVar.zzg()) {
                    String strZzc = zzahxVar.zzc();
                    String strZzb2 = zzahxVar.zzb();
                    p.d(strZzc);
                    p.d(strZzb2);
                } else if (zzahxVar.zze()) {
                    p.d(zzahxVar.zzb());
                }
            }
        }
        zzb(cVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zzd(this.zzu, this.zzv, this.zzb);
    }
}
