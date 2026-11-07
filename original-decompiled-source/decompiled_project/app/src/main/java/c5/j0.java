package c5;

import androidx.lifecycle.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<a> f4919a;

    /* renamed from: b, reason: collision with root package name */
    public int f4920b;

    /* renamed from: c, reason: collision with root package name */
    public int f4921c;

    /* renamed from: d, reason: collision with root package name */
    public int f4922d;

    /* renamed from: e, reason: collision with root package name */
    public int f4923e;

    /* renamed from: f, reason: collision with root package name */
    public int f4924f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4925g;

    /* renamed from: h, reason: collision with root package name */
    public String f4926h;

    /* renamed from: i, reason: collision with root package name */
    public int f4927i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f4928j;

    /* renamed from: k, reason: collision with root package name */
    public int f4929k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4930l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<String> f4931m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<String> f4932n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4933o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f4934a;

        /* renamed from: b, reason: collision with root package name */
        public h f4935b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4936c;

        /* renamed from: d, reason: collision with root package name */
        public int f4937d;

        /* renamed from: e, reason: collision with root package name */
        public int f4938e;

        /* renamed from: f, reason: collision with root package name */
        public int f4939f;

        /* renamed from: g, reason: collision with root package name */
        public int f4940g;

        /* renamed from: h, reason: collision with root package name */
        public l.b f4941h;

        /* renamed from: i, reason: collision with root package name */
        public l.b f4942i;

        public a() {
        }

        public a(int i10, h hVar) {
            this.f4934a = i10;
            this.f4935b = hVar;
            this.f4936c = false;
            l.b bVar = l.b.f2323e;
            this.f4941h = bVar;
            this.f4942i = bVar;
        }

        public a(int i10, h hVar, int i11) {
            this.f4934a = i10;
            this.f4935b = hVar;
            this.f4936c = true;
            l.b bVar = l.b.f2323e;
            this.f4941h = bVar;
            this.f4942i = bVar;
        }
    }

    public final void b(a aVar) {
        this.f4919a.add(aVar);
        aVar.f4937d = this.f4920b;
        aVar.f4938e = this.f4921c;
        aVar.f4939f = this.f4922d;
        aVar.f4940g = this.f4923e;
    }
}
