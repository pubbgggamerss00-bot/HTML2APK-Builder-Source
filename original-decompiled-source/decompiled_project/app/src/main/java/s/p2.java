package s;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final o2 f23868a = new o2(e.f23881a, f.f23882a);

    /* renamed from: b, reason: collision with root package name */
    public static final o2 f23869b = new o2(k.f23887a, l.f23888a);

    /* renamed from: c, reason: collision with root package name */
    public static final o2 f23870c = new o2(c.f23879a, d.f23880a);

    /* renamed from: d, reason: collision with root package name */
    public static final o2 f23871d = new o2(a.f23877a, b.f23878a);

    /* renamed from: e, reason: collision with root package name */
    public static final o2 f23872e = new o2(q.f23893a, r.f23894a);

    /* renamed from: f, reason: collision with root package name */
    public static final o2 f23873f = new o2(m.f23889a, n.f23890a);

    /* renamed from: g, reason: collision with root package name */
    public static final o2 f23874g = new o2(g.f23883a, h.f23884a);

    /* renamed from: h, reason: collision with root package name */
    public static final o2 f23875h = new o2(i.f23885a, j.f23886a);

    /* renamed from: i, reason: collision with root package name */
    public static final o2 f23876i = new o2(o.f23891a, p.f23892a);

    public static final class a extends kotlin.jvm.internal.s implements eh.l<f3.j, s.p> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23877a = new a(1);

        @Override // eh.l
        public final s.p invoke(f3.j jVar) {
            long j10 = jVar.f8818a;
            return new s.p(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<s.p, f3.j> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23878a = new b(1);

        @Override // eh.l
        public final f3.j invoke(s.p pVar) {
            s.p pVar2 = pVar;
            float f10 = pVar2.f23859a;
            float f11 = pVar2.f23860b;
            return new f3.j((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax));
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<f3.h, s.o> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f23879a = new c(1);

        @Override // eh.l
        public final s.o invoke(f3.h hVar) {
            return new s.o(hVar.f8817a);
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<s.o, f3.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f23880a = new d(1);

        @Override // eh.l
        public final f3.h invoke(s.o oVar) {
            return new f3.h(oVar.f23852a);
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.l<Float, s.o> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f23881a = new e(1);

        @Override // eh.l
        public final s.o invoke(Float f10) {
            return new s.o(f10.floatValue());
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.l<s.o, Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f23882a = new f(1);

        @Override // eh.l
        public final Float invoke(s.o oVar) {
            return Float.valueOf(oVar.f23852a);
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements eh.l<f3.m, s.p> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f23883a = new g(1);

        @Override // eh.l
        public final s.p invoke(f3.m mVar) {
            long j10 = mVar.f8820a;
            return new s.p((int) (j10 >> 32), (int) (j10 & BodyPartID.bodyIdMax));
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.l<s.p, f3.m> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f23884a = new h(1);

        @Override // eh.l
        public final f3.m invoke(s.p pVar) {
            s.p pVar2 = pVar;
            return new f3.m((Math.round(pVar2.f23859a) << 32) | (Math.round(pVar2.f23860b) & BodyPartID.bodyIdMax));
        }
    }

    public static final class i extends kotlin.jvm.internal.s implements eh.l<f3.p, s.p> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f23885a = new i(1);

        @Override // eh.l
        public final s.p invoke(f3.p pVar) {
            long j10 = pVar.f8826a;
            return new s.p((int) (j10 >> 32), (int) (j10 & BodyPartID.bodyIdMax));
        }
    }

    public static final class j extends kotlin.jvm.internal.s implements eh.l<s.p, f3.p> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f23886a = new j(1);

        @Override // eh.l
        public final f3.p invoke(s.p pVar) {
            s.p pVar2 = pVar;
            int iRound = Math.round(pVar2.f23859a);
            if (iRound < 0) {
                iRound = 0;
            }
            return new f3.p(((Math.round(pVar2.f23860b) >= 0 ? r7 : 0) & BodyPartID.bodyIdMax) | (iRound << 32));
        }
    }

    public static final class k extends kotlin.jvm.internal.s implements eh.l<Integer, s.o> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f23887a = new k(1);

        @Override // eh.l
        public final s.o invoke(Integer num) {
            return new s.o(num.intValue());
        }
    }

    public static final class l extends kotlin.jvm.internal.s implements eh.l<s.o, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f23888a = new l(1);

        @Override // eh.l
        public final Integer invoke(s.o oVar) {
            return Integer.valueOf((int) oVar.f23852a);
        }
    }

    public static final class m extends kotlin.jvm.internal.s implements eh.l<p1.c, s.p> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f23889a = new m(1);

        @Override // eh.l
        public final s.p invoke(p1.c cVar) {
            long j10 = cVar.f21129a;
            return new s.p(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
        }
    }

    public static final class n extends kotlin.jvm.internal.s implements eh.l<s.p, p1.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f23890a = new n(1);

        @Override // eh.l
        public final p1.c invoke(s.p pVar) {
            s.p pVar2 = pVar;
            float f10 = pVar2.f23859a;
            float f11 = pVar2.f23860b;
            return new p1.c((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax));
        }
    }

    public static final class o extends kotlin.jvm.internal.s implements eh.l<p1.e, s.r> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f23891a = new o(1);

        @Override // eh.l
        public final s.r invoke(p1.e eVar) {
            p1.e eVar2 = eVar;
            return new s.r(eVar2.f21131a, eVar2.f21132b, eVar2.f21133c, eVar2.f21134d);
        }
    }

    public static final class p extends kotlin.jvm.internal.s implements eh.l<s.r, p1.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f23892a = new p(1);

        @Override // eh.l
        public final p1.e invoke(s.r rVar) {
            s.r rVar2 = rVar;
            return new p1.e(rVar2.f23901a, rVar2.f23902b, rVar2.f23903c, rVar2.f23904d);
        }
    }

    public static final class q extends kotlin.jvm.internal.s implements eh.l<p1.h, s.p> {

        /* renamed from: a, reason: collision with root package name */
        public static final q f23893a = new q(1);

        @Override // eh.l
        public final s.p invoke(p1.h hVar) {
            long j10 = hVar.f21143a;
            return new s.p(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
        }
    }

    public static final class r extends kotlin.jvm.internal.s implements eh.l<s.p, p1.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final r f23894a = new r(1);

        @Override // eh.l
        public final p1.h invoke(s.p pVar) {
            s.p pVar2 = pVar;
            float f10 = pVar2.f23859a;
            float f11 = pVar2.f23860b;
            return new p1.h((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax));
        }
    }
}
