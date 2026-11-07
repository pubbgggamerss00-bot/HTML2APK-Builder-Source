package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

/* loaded from: classes2.dex */
final class zzil extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzil(zzja zzjaVar, tg.e eVar) {
        super(2, eVar);
        this.zzc = zzjaVar;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzil(this.zzc, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[PHI: r7
      0x0055: PHI (r7v15 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0053, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zzb;
        if (i10 == 0) {
            q.b(obj);
            zzja zzjaVar = this.zzc;
            this.zzb = 1;
            obj = zzjaVar.zzw(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                q.b(obj);
                if (i10 == 3) {
                    ((WebView) obj).addJavascriptInterface(this.zzc.zzq(), "RN");
                    zzja zzjaVar2 = this.zzc;
                    this.zzb = 4;
                    obj = zzjaVar2.zzw(this);
                }
                ((WebView) obj).setWebViewClient(new zzik(this.zzc));
                return f0.f21461a;
            }
            q.b(obj);
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzja zzjaVar3 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzjaVar3.zzw(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        q.b(obj);
        ((WebView) obj).removeJavascriptInterface("RN");
        zzja zzjaVar4 = this.zzc;
        this.zza = zzjaVar4;
        this.zzb = 2;
        obj = zzjaVar4.zzw(this);
        if (obj != aVar) {
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzja zzjaVar32 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzjaVar32.zzw(this);
            if (obj != aVar) {
            }
        }
        return aVar;
    }
}
