package j2;

import androidx.work.q;
import androidx.work.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends q {

    /* renamed from: g, reason: collision with root package name */
    public static final String f13461g = androidx.work.k.e("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final k f13462a;

    /* renamed from: c, reason: collision with root package name */
    public final List<? extends r> f13464c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13465d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13467f;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.g f13463b = androidx.work.g.s;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f13466e = new ArrayList();

    public g(k kVar, List<? extends r> list) {
        this.f13462a = kVar;
        this.f13464c = list;
        this.f13465d = new ArrayList(list.size());
        for (int i6 = 0; i6 < list.size(); i6++) {
            String string = list.get(i6).f1849a.toString();
            this.f13465d.add(string);
            this.f13466e.add(string);
        }
    }

    public static HashSet b(g gVar) {
        HashSet hashSet = new HashSet();
        gVar.getClass();
        return hashSet;
    }
}
