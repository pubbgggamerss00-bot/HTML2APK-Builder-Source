package com.google.android.recaptcha.internal;

import a9.c2;
import eh.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pg.f0;
import pg.q;
import ph.h;
import ph.i0;
import ph.s1;
import vg.i;

/* loaded from: classes2.dex */
final class zzs extends i implements p {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, tg.e eVar) {
        super(2, eVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // vg.a
    public final tg.e create(Object obj, tg.e eVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, eVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((i0) obj, (tg.e) obj2)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.zza;
        q.b(obj);
        if (i10 == 0) {
            i0 i0Var = (i0) this.zzd;
            ArrayList arrayList = new ArrayList();
            this.zzb.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            int size = arrayList3.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                arrayList2.add(h.c(i0Var, null, null, new zzr((zzy) obj3, this.zzc, arrayList, null), 3));
            }
            s1[] s1VarArr = (s1[]) arrayList2.toArray(new s1[0]);
            s1[] s1VarArr2 = (s1[]) Arrays.copyOf(s1VarArr, s1VarArr.length);
            this.zza = 1;
            if (c2.c(s1VarArr2, this) == aVar) {
                return aVar;
            }
        }
        return new pg.p(this.zzb.zzq(this.zzc));
    }
}
