package g7;

import e9.w0;
import f9.pa;
import j7.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l7.k;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<o7.j> f11487a;

    /* renamed from: b, reason: collision with root package name */
    public final List<pg.n<q7.c<? extends Object, ? extends Object>, kh.c<? extends Object>>> f11488b;

    /* renamed from: c, reason: collision with root package name */
    public final List<pg.n<p7.c<? extends Object>, kh.c<? extends Object>>> f11489c;

    /* renamed from: d, reason: collision with root package name */
    public List<? extends eh.a<? extends List<? extends pg.n<? extends k.a<? extends Object>, ? extends kh.c<? extends Object>>>>> f11490d;

    /* renamed from: e, reason: collision with root package name */
    public List<? extends eh.a<? extends List<? extends i.a>>> f11491e;

    /* renamed from: f, reason: collision with root package name */
    public final pg.s f11492f;

    /* renamed from: g, reason: collision with root package name */
    public final pg.s f11493g;

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends o7.j> list, List<? extends pg.n<? extends q7.c<? extends Object, ? extends Object>, ? extends kh.c<? extends Object>>> list2, List<? extends pg.n<? extends p7.c<? extends Object>, ? extends kh.c<? extends Object>>> list3, List<? extends eh.a<? extends List<? extends pg.n<? extends k.a<? extends Object>, ? extends kh.c<? extends Object>>>>> list4, List<? extends eh.a<? extends List<? extends i.a>>> list5) {
        this.f11487a = list;
        this.f11488b = list2;
        this.f11489c = list3;
        this.f11490d = list4;
        this.f11491e = list5;
        this.f11492f = w0.b(new androidx.credentials.playservices.controllers.identityauth.beginsignin.r(this, 1));
        this.f11493g = w0.b(new b(this, 0));
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f11494a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f11495b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f11496c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f11497d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f11498e;

        public a() {
            this.f11494a = new ArrayList();
            this.f11495b = new ArrayList();
            this.f11496c = new ArrayList();
            this.f11497d = new ArrayList();
            this.f11498e = new ArrayList();
        }

        public final void a(k.a aVar, kotlin.jvm.internal.h hVar) {
            this.f11497d.add(new d(0, aVar, hVar));
        }

        public final void b(q7.c cVar, kotlin.jvm.internal.h hVar) {
            this.f11495b.add(new pg.n(cVar, hVar));
        }

        public final f c() {
            return new f(b8.c.a(this.f11494a), b8.c.a(this.f11495b), b8.c.a(this.f11496c), b8.c.a(this.f11497d), b8.c.a(this.f11498e));
        }

        public a(f fVar) {
            this.f11494a = qg.x.e0(fVar.f11487a);
            this.f11495b = qg.x.e0(fVar.f11488b);
            this.f11496c = qg.x.e0(fVar.f11489c);
            List list = (List) fVar.f11492f.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new c((pg.n) it.next(), 0));
            }
            this.f11497d = arrayList;
            List list2 = (List) fVar.f11493g.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new pa((i.a) it2.next(), 1));
            }
            this.f11498e = arrayList2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f() {
        qg.z zVar = qg.z.f22752a;
        this(zVar, zVar, zVar, zVar, zVar);
    }
}
