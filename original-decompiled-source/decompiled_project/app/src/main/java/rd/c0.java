package rd;

import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzahq;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class c0 {
    public static ArrayList a(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qd.u uVarB = b((zzahq) it.next());
            if (uVarB != null) {
                arrayList.add(uVarB);
            }
        }
        return arrayList;
    }

    public static qd.u b(zzahq zzahqVar) {
        if (zzahqVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahqVar.zze())) {
            String strZzd = zzahqVar.zzd();
            String strZzc = zzahqVar.zzc();
            long jZza = zzahqVar.zza();
            String strZze = zzahqVar.zze();
            com.google.android.gms.common.internal.p.d(strZze);
            return new qd.b0(strZzd, strZzc, jZza, strZze);
        }
        if (zzahqVar.zzb() == null) {
            return null;
        }
        String strZzd2 = zzahqVar.zzd();
        String strZzc2 = zzahqVar.zzc();
        long jZza2 = zzahqVar.zza();
        zzair zzairVarZzb = zzahqVar.zzb();
        com.google.android.gms.common.internal.p.g(zzairVarZzb, "totpInfo cannot be null.");
        return new qd.e0(strZzd2, strZzc2, jZza2, zzairVarZzb);
    }
}
