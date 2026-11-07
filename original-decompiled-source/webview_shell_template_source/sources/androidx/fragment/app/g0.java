package androidx.fragment.app;

import androidx.lifecycle.h;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<a> f1109a;

    /* renamed from: b, reason: collision with root package name */
    public int f1110b;

    /* renamed from: c, reason: collision with root package name */
    public int f1111c;

    /* renamed from: d, reason: collision with root package name */
    public int f1112d;

    /* renamed from: e, reason: collision with root package name */
    public int f1113e;

    /* renamed from: f, reason: collision with root package name */
    public int f1114f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1115g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public int f1116i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1117j;

    /* renamed from: k, reason: collision with root package name */
    public int f1118k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1119l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<String> f1120m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<String> f1121n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1122o;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f1123a;

        /* renamed from: b, reason: collision with root package name */
        public k f1124b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1125c;

        /* renamed from: d, reason: collision with root package name */
        public int f1126d;

        /* renamed from: e, reason: collision with root package name */
        public int f1127e;

        /* renamed from: f, reason: collision with root package name */
        public int f1128f;

        /* renamed from: g, reason: collision with root package name */
        public int f1129g;
        public h.b h;

        /* renamed from: i, reason: collision with root package name */
        public h.b f1130i;

        public a() {
        }

        public a(int i6, k kVar) {
            this.f1123a = i6;
            this.f1124b = kVar;
            this.f1125c = false;
            h.b bVar = h.b.f1304w;
            this.h = bVar;
            this.f1130i = bVar;
        }

        public a(int i6, k kVar, int i7) {
            this.f1123a = i6;
            this.f1124b = kVar;
            this.f1125c = true;
            h.b bVar = h.b.f1304w;
            this.h = bVar;
            this.f1130i = bVar;
        }
    }

    public final void b(a aVar) {
        this.f1109a.add(aVar);
        aVar.f1126d = this.f1110b;
        aVar.f1127e = this.f1111c;
        aVar.f1128f = this.f1112d;
        aVar.f1129g = this.f1113e;
    }
}
