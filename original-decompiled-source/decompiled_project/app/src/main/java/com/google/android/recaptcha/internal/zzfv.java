package com.google.android.recaptcha.internal;

import eh.p;
import java.util.ArrayList;
import pg.f0;
import pg.q;
import ph.i0;
import qg.x;
import vg.i;

/* loaded from: classes2.dex */
final class zzfv extends i implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzfw zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfv(String[] strArr, zzfw zzfwVar, String str, tg.e eVar) {
        super(2, eVar);
        this.zza = strArr;
        this.zzb = zzfwVar;
        this.zzc = str;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        return new zzfv(this.zza, this.zzb, this.zzc, eVar);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfv) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        q.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(this.zzc + "(" + x.I(arrayList, ",", null, null, null, 62) + ")", null);
        return f0.f21461a;
    }
}
