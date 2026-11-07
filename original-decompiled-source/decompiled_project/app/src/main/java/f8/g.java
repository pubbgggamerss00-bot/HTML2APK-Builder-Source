package f8;

import a9.b2;
import a9.v;
import androidx.lifecycle.l0;
import c9.s1;
import e9.s0;
import f9.fg;
import g8.u;
import g9.y;
import h9.b4;
import h9.x;
import j9.x1;
import nc.s;
import t8.m3;
import t8.q0;
import u8.d1;
import x8.j6;
import z8.e0;

/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f8897a;

    /* renamed from: b, reason: collision with root package name */
    public final a f8898b;

    /* renamed from: c, reason: collision with root package name */
    public final a f8899c;

    /* renamed from: d, reason: collision with root package name */
    public final a f8900d;

    /* renamed from: e, reason: collision with root package name */
    public final a f8901e;

    /* renamed from: f, reason: collision with root package name */
    public final a f8902f;

    /* renamed from: g, reason: collision with root package name */
    public final a f8903g;

    /* renamed from: h, reason: collision with root package name */
    public final a f8904h;

    /* renamed from: i, reason: collision with root package name */
    public final a f8905i;

    /* renamed from: j, reason: collision with root package name */
    public final a f8906j;

    /* renamed from: k, reason: collision with root package name */
    public final a f8907k;

    /* renamed from: l, reason: collision with root package name */
    public final a f8908l;

    /* renamed from: m, reason: collision with root package name */
    public final a f8909m;

    /* renamed from: n, reason: collision with root package name */
    public final a f8910n;

    /* renamed from: o, reason: collision with root package name */
    public final a f8911o;

    /* renamed from: p, reason: collision with root package name */
    public final a f8912p;

    /* renamed from: q, reason: collision with root package name */
    public final a f8913q;

    /* renamed from: r, reason: collision with root package name */
    public final a f8914r;

    public static final class a<T> implements ng.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final e f8915a;

        /* renamed from: b, reason: collision with root package name */
        public final g f8916b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8917c;

        public a(e eVar, g gVar, int i10) {
            this.f8915a = eVar;
            this.f8916b = gVar;
            this.f8917c = i10;
        }

        @Override // og.a
        public final T get() {
            g gVar = this.f8916b;
            e eVar = this.f8915a;
            int i10 = this.f8917c;
            switch (i10) {
                case 0:
                    return (T) new u(eVar.f8882e.get());
                case 1:
                    return (T) new q0(eVar.f8882e.get(), eVar.f8888k.get());
                case 2:
                    return (T) new m3(gVar.f8897a, eVar.f8884g.get(), eVar.f8888k.get(), eVar.f8882e.get(), eVar.f8889l.get());
                case 3:
                    return (T) new s0(gg.a.g(eVar.f8878a.f16306a), eVar.f8886i.get(), eVar.f8891n.get(), eVar.f8880c.get(), eVar.f8888k.get(), gVar.f8897a);
                case 4:
                    return (T) new d1(eVar.f8892o.get());
                case 5:
                    return (T) new v(eVar.f8881d.get(), eVar.f8882e.get(), eVar.f8883f.get());
                case 6:
                    return (T) new f9.g(eVar.f8886i.get(), eVar.f8880c.get(), eVar.f8890m.get());
                case 7:
                    return (T) new j6(eVar.f8886i.get(), eVar.f8891n.get(), eVar.f8880c.get(), eVar.f8890m.get(), eVar.f8887j.get(), eVar.f8878a.f16306a, eVar.f8888k.get());
                case 8:
                    return (T) new x(eVar.f8891n.get(), eVar.f8886i.get());
                case 9:
                    return (T) new e0(eVar.f8878a.f16306a, eVar.f8880c.get());
                case 10:
                    return (T) new s1(eVar.f8878a.f16306a, eVar.f8886i.get());
                case 11:
                    return (T) new b2(eVar.f8881d.get(), eVar.f8882e.get(), eVar.f8883f.get());
                case 12:
                    return (T) new fg(eVar.f8886i.get(), eVar.f8891n.get(), eVar.f8880c.get(), gVar.f8897a, gg.a.g(eVar.f8878a.f16306a), eVar.f8887j.get());
                case 13:
                    return (T) new b4(eVar.f8878a.f16306a, eVar.f8880c.get());
                case 14:
                    return (T) new y(eVar.f8886i.get(), gg.a.g(eVar.f8878a.f16306a), gVar.f8897a, eVar.f8887j.get());
                case 15:
                    return (T) new i9.r(eVar.f8881d.get());
                case 16:
                    return (T) new x1(eVar.f8886i.get(), eVar.f8880c.get());
                default:
                    throw new AssertionError(i10);
            }
        }
    }

    public g(e eVar, d dVar, l0 l0Var) {
        this.f8897a = l0Var;
        this.f8898b = new a(eVar, this, 0);
        this.f8899c = new a(eVar, this, 1);
        this.f8900d = new a(eVar, this, 2);
        this.f8901e = new a(eVar, this, 3);
        this.f8902f = new a(eVar, this, 4);
        this.f8903g = new a(eVar, this, 5);
        this.f8904h = new a(eVar, this, 6);
        this.f8905i = new a(eVar, this, 7);
        this.f8906j = new a(eVar, this, 8);
        this.f8907k = new a(eVar, this, 9);
        this.f8908l = new a(eVar, this, 10);
        this.f8909m = new a(eVar, this, 11);
        this.f8910n = new a(eVar, this, 12);
        this.f8911o = new a(eVar, this, 13);
        this.f8912p = new a(eVar, this, 14);
        this.f8913q = new a(eVar, this, 15);
        this.f8914r = new a(eVar, this, 16);
    }

    @Override // ig.b.d
    public final ng.b a() {
        nc.g.b(17, "expectedSize");
        s.a aVar = new s.a(17);
        aVar.b("g8.u", this.f8898b);
        aVar.b("t8.q0", this.f8899c);
        aVar.b("t8.m3", this.f8900d);
        aVar.b("e9.s0", this.f8901e);
        aVar.b("u8.d1", this.f8902f);
        aVar.b("a9.v", this.f8903g);
        aVar.b("f9.g", this.f8904h);
        aVar.b("x8.j6", this.f8905i);
        aVar.b("h9.x", this.f8906j);
        aVar.b("z8.e0", this.f8907k);
        aVar.b("c9.s1", this.f8908l);
        aVar.b("a9.b2", this.f8909m);
        aVar.b("f9.fg", this.f8910n);
        aVar.b("h9.b4", this.f8911o);
        aVar.b("g9.y", this.f8912p);
        aVar.b("i9.r", this.f8913q);
        aVar.b("j9.x1", this.f8914r);
        return new ng.b(aVar.a());
    }
}
