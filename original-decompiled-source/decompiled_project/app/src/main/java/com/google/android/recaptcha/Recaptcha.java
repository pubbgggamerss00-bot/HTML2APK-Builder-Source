package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import com.google.android.recaptcha.internal.zzdc;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.d;
import pg.p;
import pg.q;
import tg.e;
import ug.a;

/* loaded from: classes2.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m69getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j10, e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 10000;
        }
        return recaptcha.m70getClientBWLJW6A(application, str, j10, eVar);
    }

    @d
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, e<? super RecaptchaClient> eVar) {
        return zzcq.zzd(application, str, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @d
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70getClientBWLJW6A(Application application, String str, long j10, e<? super p<? extends RecaptchaClient>> eVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (eVar instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) eVar;
            int i10 = recaptcha$getClient$1.zzc;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                recaptcha$getClient$1.zzc = i10 - PKIFailureInfo.systemUnavail;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, eVar);
            }
        }
        Object objZzb = recaptcha$getClient$1.zza;
        a aVar = a.f29706a;
        int i11 = recaptcha$getClient$1.zzc;
        try {
            if (i11 == 0) {
                q.b(objZzb);
                recaptcha$getClient$1.zzc = 1;
                objZzb = zzcq.zzb(application, str, j10, recaptcha$getClient$1);
                if (objZzb == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(objZzb);
            }
            return (zzdc) objZzb;
        } catch (Throwable th2) {
            return q.a(th2);
        }
    }

    @d
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j10) {
        return zzcq.zzc(application, str, j10);
    }
}
