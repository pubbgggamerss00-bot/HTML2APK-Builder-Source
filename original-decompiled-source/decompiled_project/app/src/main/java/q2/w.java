package q2;

import java.util.ArrayList;
import java.util.List;
import pg.f0;
import t2.j0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final c0<List<String>> f21820a = a0.b("ContentDescription", b.f21847a);

    /* renamed from: b, reason: collision with root package name */
    public static final c0<String> f21821b = a0.a("StateDescription");

    /* renamed from: c, reason: collision with root package name */
    public static final c0<q2.h> f21822c = a0.a("ProgressBarRangeInfo");

    /* renamed from: d, reason: collision with root package name */
    public static final c0<String> f21823d = a0.b("PaneTitle", i.f21854a);

    /* renamed from: e, reason: collision with root package name */
    public static final c0<f0> f21824e = a0.a("SelectableGroup");

    /* renamed from: f, reason: collision with root package name */
    public static final c0<q2.b> f21825f = a0.a("CollectionInfo");

    /* renamed from: g, reason: collision with root package name */
    public static final c0<q2.c> f21826g = a0.a("CollectionItemInfo");

    /* renamed from: h, reason: collision with root package name */
    public static final c0<f0> f21827h = a0.a("Heading");

    /* renamed from: i, reason: collision with root package name */
    public static final c0<f0> f21828i = a0.a("Disabled");

    /* renamed from: j, reason: collision with root package name */
    public static final c0<q2.g> f21829j = a0.a("LiveRegion");

    /* renamed from: k, reason: collision with root package name */
    public static final c0<Boolean> f21830k = a0.a("Focused");

    /* renamed from: l, reason: collision with root package name */
    public static final c0<Boolean> f21831l = a0.a("IsContainer");

    /* renamed from: m, reason: collision with root package name */
    public static final c0<Boolean> f21832m = new c0<>("IsTraversalGroup");

    /* renamed from: n, reason: collision with root package name */
    public static final c0<f0> f21833n = new c0<>("InvisibleToUser", e.f21850a);

    /* renamed from: o, reason: collision with root package name */
    public static final c0<f0> f21834o = new c0<>("HideFromAccessibility", d.f21849a);

    /* renamed from: p, reason: collision with root package name */
    public static final c0<k1.n> f21835p = new c0<>("ContentType", c.f21848a);

    /* renamed from: q, reason: collision with root package name */
    public static final c0<k1.m> f21836q = new c0<>("ContentDataType", a.f21846a);

    /* renamed from: r, reason: collision with root package name */
    public static final c0<Float> f21837r = new c0<>("TraversalIndex", m.f21858a);

    /* renamed from: s, reason: collision with root package name */
    public static final c0<q2.j> f21838s = a0.a("HorizontalScrollAxisRange");

    /* renamed from: t, reason: collision with root package name */
    public static final c0<q2.j> f21839t = a0.a("VerticalScrollAxisRange");

    /* renamed from: u, reason: collision with root package name */
    public static final c0<f0> f21840u = a0.b("IsPopup", g.f21852a);

    /* renamed from: v, reason: collision with root package name */
    public static final c0<f0> f21841v = a0.b("IsDialog", f.f21851a);

    /* renamed from: w, reason: collision with root package name */
    public static final c0<q2.i> f21842w = a0.b("Role", j.f21855a);

    /* renamed from: x, reason: collision with root package name */
    public static final c0<String> f21843x = new c0<>("TestTag", false, k.f21856a);

    /* renamed from: y, reason: collision with root package name */
    public static final c0<f0> f21844y = new c0<>("LinkTestMarker", false, h.f21853a);

    /* renamed from: z, reason: collision with root package name */
    public static final c0<List<t2.b>> f21845z = a0.b("Text", l.f21857a);
    public static final c0<t2.b> A = new c0<>("TextSubstitution");
    public static final c0<Boolean> B = new c0<>("IsShowingTextSubstitution");
    public static final c0<t2.b> C = a0.a("InputText");
    public static final c0<t2.b> D = a0.a("EditableText");
    public static final c0<j0> E = a0.a("TextSelectionRange");
    public static final c0<y2.n> F = a0.a("ImeAction");
    public static final c0<Boolean> G = a0.a("Selected");
    public static final c0<s2.a> H = a0.a("ToggleableState");
    public static final c0<f0> I = a0.a("Password");
    public static final c0<String> J = a0.a("Error");
    public static final c0<eh.l<Object, Integer>> K = new c0<>("IndexForKey");
    public static final c0<Boolean> L = new c0<>("IsEditable");
    public static final c0<Integer> M = new c0<>("MaxTextLength");

    public static final class a extends kotlin.jvm.internal.s implements eh.p<k1.m, k1.m, k1.m> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f21846a = new a(2);

        @Override // eh.p
        public final k1.m invoke(k1.m mVar, k1.m mVar2) {
            return mVar;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f21847a = new b(2);

        @Override // eh.p
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayListE0 = qg.x.e0(list3);
            arrayListE0.addAll(list4);
            return arrayListE0;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.p<k1.n, k1.n, k1.n> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f21848a = new c(2);

        @Override // eh.p
        public final k1.n invoke(k1.n nVar, k1.n nVar2) {
            return nVar;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.p<f0, f0, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f21849a = new d(2);

        @Override // eh.p
        public final f0 invoke(f0 f0Var, f0 f0Var2) {
            return f0Var;
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.p<f0, f0, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f21850a = new e(2);

        @Override // eh.p
        public final f0 invoke(f0 f0Var, f0 f0Var2) {
            return f0Var;
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.p<f0, f0, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f21851a = new f(2);

        @Override // eh.p
        public final f0 invoke(f0 f0Var, f0 f0Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements eh.p<f0, f0, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f21852a = new g(2);

        @Override // eh.p
        public final f0 invoke(f0 f0Var, f0 f0Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.p<f0, f0, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f21853a = new h(2);

        @Override // eh.p
        public final f0 invoke(f0 f0Var, f0 f0Var2) {
            return f0Var;
        }
    }

    public static final class i extends kotlin.jvm.internal.s implements eh.p<String, String, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f21854a = new i(2);

        @Override // eh.p
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    public static final class j extends kotlin.jvm.internal.s implements eh.p<q2.i, q2.i, q2.i> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f21855a = new j(2);

        @Override // eh.p
        public final q2.i invoke(q2.i iVar, q2.i iVar2) {
            q2.i iVar3 = iVar;
            int i10 = iVar2.f21770a;
            return iVar3;
        }
    }

    public static final class k extends kotlin.jvm.internal.s implements eh.p<String, String, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f21856a = new k(2);

        @Override // eh.p
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    public static final class l extends kotlin.jvm.internal.s implements eh.p<List<? extends t2.b>, List<? extends t2.b>, List<? extends t2.b>> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f21857a = new l(2);

        @Override // eh.p
        public final List<? extends t2.b> invoke(List<? extends t2.b> list, List<? extends t2.b> list2) {
            List<? extends t2.b> list3 = list;
            List<? extends t2.b> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayListE0 = qg.x.e0(list3);
            arrayListE0.addAll(list4);
            return arrayListE0;
        }
    }

    public static final class m extends kotlin.jvm.internal.s implements eh.p<Float, Float, Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f21858a = new m(2);

        @Override // eh.p
        public final Float invoke(Float f10, Float f11) {
            Float f12 = f10;
            f11.floatValue();
            return f12;
        }
    }
}
