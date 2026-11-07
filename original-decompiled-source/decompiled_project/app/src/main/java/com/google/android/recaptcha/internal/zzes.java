package com.google.android.recaptcha.internal;

import android.content.Context;
import c1.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kotlin.jvm.internal.r;
import pg.f0;
import pg.l;
import ph.h;
import ph.i0;
import qg.o0;
import qg.y;

/* loaded from: classes2.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final i0 zzd;
    private final zzei zze;

    public zzes(Context context, zzet zzetVar, i0 i0Var) {
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = i0Var;
        zzei zzeiVar = null;
        try {
            zzei zzeiVar2 = zzei.zzd;
            zzeiVar2 = zzeiVar2 == null ? new zzei(context, null) : zzeiVar2;
            zzei.zzd = zzeiVar2;
            zzeiVar = zzeiVar2;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        ArrayList arrayList;
        zzei zzeiVar;
        zztx zztxVarZzk;
        int iZzN;
        int i10;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            List listZzd = zzeiVar2.zzd();
            r.e(listZzd, "<this>");
            x.d(20, 20);
            int i11 = 0;
            if (listZzd instanceof RandomAccess) {
                int size = listZzd.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i12 = 0; i12 >= 0 && i12 < size; i12 += 20) {
                    int i13 = size - i12;
                    if (20 <= i13) {
                        i13 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i13);
                    for (int i14 = 0; i14 < i13; i14++) {
                        arrayList2.add(listZzd.get(i14 + i12));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator iterator = listZzd.iterator();
                r.e(iterator, "iterator");
                Iterator itF = !iterator.hasNext() ? y.f22751a : e1.d.f(new o0(iterator, null));
                while (itF.hasNext()) {
                    arrayList.add((List) itF.next());
                }
            }
            int size2 = arrayList.size();
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                zzrd zzrdVarZzi = zzrf.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzej zzejVar : (List) obj) {
                    try {
                        zztxVarZzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        iZzN = zztxVarZzk.zzN();
                        i10 = iZzN - 1;
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                    if (iZzN == 0) {
                        throw null;
                    }
                    if (i10 == 0) {
                        zzrdVarZzi.zzq(zztxVarZzk.zzf());
                    } else if (i10 == 1) {
                        zzrdVarZzi.zzr(zztxVarZzk.zzg());
                    } else {
                        if (i10 != 2) {
                            throw new l();
                        }
                        f0 f0Var = f0.f21461a;
                    }
                    arrayList3.add(zzejVar);
                }
                if (zzrdVarZzi.zzf() + zzrdVarZzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzrdVarZzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList3);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(zztx zztxVar) {
        h.c(this.zzd, null, null, new zzer(this, zztxVar, null), 3);
        zzh();
    }
}
