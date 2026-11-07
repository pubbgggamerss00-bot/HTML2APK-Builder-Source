package i8;

import android.util.Log;
import androidx.room.y0;
import d8.k;
import d8.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import qg.j0;
import qg.k0;
import qg.p;
import sh.z0;

/* loaded from: classes.dex */
public final /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f14210b;

    public /* synthetic */ g(String str, j jVar) {
        this.f14209a = str;
        this.f14210b = jVar;
    }

    public final void a(com.android.billingclient.api.a result, d8.o oVar) {
        r.e(result, "result");
        List<d8.k> list = oVar.f7536a;
        int i10 = result.f5606a;
        if (i10 != 0) {
            String str = result.f5608c;
            StringBuilder sbA = androidx.datastore.preferences.protobuf.h.a(i10, "queryProductDetails(", this.f14209a, ") failed: ", " ");
            sbA.append(str);
            Log.w("BillingManager", sbA.toString());
        }
        r.d(list, "getProductDetailsList(...)");
        Iterator<T> it = list.iterator();
        while (true) {
            Integer numValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            d8.k kVar = (d8.k) it.next();
            String str2 = kVar.f7504c;
            k.a aVarA = kVar.a();
            String str3 = aVarA != null ? aVarA.f7511a : null;
            ArrayList arrayList = kVar.f7510i;
            if (arrayList != null) {
                numValueOf = Integer.valueOf(arrayList.size());
            }
            StringBuilder sbA2 = y0.a("Product ", str2, ": offer=", str3, " options=");
            sbA2.append(numValueOf);
            Log.d("BillingManager", sbA2.toString());
        }
        List<q> list2 = oVar.f7537b;
        r.d(list2, "getUnfetchedProductList(...)");
        for (q qVar : list2) {
            Log.w("BillingManager", "Product not returned by Play: " + qVar.f7543b + " (status " + qVar.f7545d + ")");
        }
        if (result.f5606a == 0) {
            z0 z0Var = this.f14210b.f14229i;
            Map map = (Map) z0Var.getValue();
            int iA = j0.a(p.h(list, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : list) {
                linkedHashMap.put(((d8.k) obj).f7504c, obj);
            }
            z0Var.j(null, k0.f(map, linkedHashMap));
        }
    }
}
