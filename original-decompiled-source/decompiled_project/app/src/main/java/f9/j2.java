package f9;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Iterator;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$6$1", f = "HtmlEditorScreen.kt", l = {385, 386}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public String f9841a;

    /* renamed from: b, reason: collision with root package name */
    public String f9842b;

    /* renamed from: c, reason: collision with root package name */
    public int f9843c;

    /* renamed from: d, reason: collision with root package name */
    public int f9844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f9845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<List<Integer>> f9847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f9848h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f9849j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9850k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f9851l;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$6$1$found$1", f = "HtmlEditorScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super List<? extends Integer>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f9852a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f9853b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9854c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f9853b = str;
            this.f9854c = str2;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f9853b, this.f9854c, eVar);
            aVar.f9852a = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super List<? extends Integer>> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            return f9.a.a(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, new i2(((ph.i0) this.f9852a).getCoroutineContext(), 0), this.f9853b, this.f9854c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(x0.n1<String> n1Var, x0.n1<Boolean> n1Var2, x0.n1<List<Integer>> n1Var3, x0.n1<String> n1Var4, x0.n1<y2.c0> n1Var5, x0.n1<Boolean> n1Var6, x0.l1 l1Var, tg.e<? super j2> eVar) {
        super(2, eVar);
        this.f9845e = n1Var;
        this.f9846f = n1Var2;
        this.f9847g = n1Var3;
        this.f9848h = n1Var4;
        this.f9849j = n1Var5;
        this.f9850k = n1Var6;
        this.f9851l = l1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new j2(this.f9845e, this.f9846f, this.f9847g, this.f9848h, this.f9849j, this.f9850k, this.f9851l, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((j2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[SYNTHETIC] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String value;
        String str;
        int i10;
        int i11;
        String str2;
        List<Integer> list;
        x0.l1 l1Var;
        Iterator<Integer> it;
        int i12;
        ug.a aVar = ug.a.f29706a;
        int i13 = this.f9844d;
        x0.n1<List<Integer>> n1Var = this.f9847g;
        x0.n1<String> n1Var2 = this.f9848h;
        x0.n1<y2.c0> n1Var3 = this.f9849j;
        if (i13 == 0) {
            pg.q.b(obj);
            List<String> list2 = d1.f9265a;
            value = this.f9845e.getValue();
            if (!this.f9846f.getValue().booleanValue() || mh.x.A(value)) {
                n1Var.setValue(qg.z.f22752a);
                n1Var2.setValue("");
                return pg.f0.f21461a;
            }
            str = n1Var3.getValue().f33682a.f27761b;
            i10 = !kotlin.jvm.internal.r.a(n1Var2.getValue(), value) ? 1 : 0;
            this.f9841a = value;
            this.f9842b = str;
            this.f9843c = i10;
            this.f9844d = 1;
            if (ph.t0.b(120L, this) != aVar) {
            }
            return aVar;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f9843c;
            str2 = this.f9841a;
            pg.q.b(obj);
            list = (List) obj;
            List<String> list3 = d1.f9265a;
            n1Var.setValue(list);
            n1Var2.setValue(str2);
            l1Var = this.f9851l;
            x0.n1<Boolean> n1Var4 = this.f9850k;
            if ((i11 == 0 || n1Var4.getValue().booleanValue()) && !list.isEmpty()) {
                int iE = t2.j0.e(n1Var3.getValue().f33683b);
                it = list.iterator();
                i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                        break;
                    }
                    if (it.next().intValue() >= iE) {
                        break;
                    }
                    i12++;
                }
                int i14 = i12 >= 0 ? i12 : 0;
                l1Var.f(i14);
                n1Var3.setValue(y2.c0.b(n1Var3.getValue(), null, t2.k0.a(list.get(i14).intValue(), str2.length() + list.get(i14).intValue()), 5));
            } else {
                int iG = l1Var.g();
                int size = list.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                l1Var.f(jh.j.m(iG, 0, size));
            }
            n1Var4.setValue(Boolean.FALSE);
            return pg.f0.f21461a;
        }
        i10 = this.f9843c;
        str = this.f9842b;
        String str3 = this.f9841a;
        pg.q.b(obj);
        value = str3;
        wh.c cVar = ph.z0.f21632a;
        a aVar2 = new a(str, value, null);
        this.f9841a = value;
        this.f9842b = null;
        this.f9843c = i10;
        this.f9844d = 2;
        Object objE = ph.h.e(cVar, aVar2, this);
        if (objE != aVar) {
            i11 = i10;
            str2 = value;
            obj = objE;
            list = (List) obj;
            List<String> list32 = d1.f9265a;
            n1Var.setValue(list);
            n1Var2.setValue(str2);
            l1Var = this.f9851l;
            x0.n1<Boolean> n1Var42 = this.f9850k;
            if (i11 == 0) {
                int iE2 = t2.j0.e(n1Var3.getValue().f33683b);
                it = list.iterator();
                i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                    }
                    i12++;
                }
                if (i12 >= 0) {
                }
                l1Var.f(i14);
                n1Var3.setValue(y2.c0.b(n1Var3.getValue(), null, t2.k0.a(list.get(i14).intValue(), str2.length() + list.get(i14).intValue()), 5));
            } else {
                int iE22 = t2.j0.e(n1Var3.getValue().f33683b);
                it = list.iterator();
                i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                    }
                    i12++;
                }
                if (i12 >= 0) {
                }
                l1Var.f(i14);
                n1Var3.setValue(y2.c0.b(n1Var3.getValue(), null, t2.k0.a(list.get(i14).intValue(), str2.length() + list.get(i14).intValue()), 5));
            }
            n1Var42.setValue(Boolean.FALSE);
            return pg.f0.f21461a;
        }
        return aVar;
    }
}
