package x8;

import java.util.Iterator;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeFoldersKt$FolderIntroOverlay$1$1", f = "HomeFolders.kt", l = {446, 448, 456, 458}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33261a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f33263c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f33264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<s.b<Float, s.o>> f33265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f33266f;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeFoldersKt$FolderIntroOverlay$1$1$2$1", f = "HomeFolders.kt", l = {452, 453}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f33267a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f33268b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f33269c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, s.b<Float, s.o> bVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f33268b = i10;
            this.f33269c = bVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f33268b, this.f33269c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (s.b.c(r10.f33269c, r5, r6, null, r10, 12) == r0) goto L15;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f33267a;
            if (i10 == 0) {
                pg.q.b(obj);
                long j10 = this.f33268b * 140;
                this.f33267a = 1;
                if (ph.t0.b(j10, this) != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
            Float f10 = new Float(1.0f);
            s.m2 m2VarD = s.m.d(650, 0, s.d0.f23703a, 2);
            this.f33267a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s.b<Float, s.o> bVar, boolean z10, List<s.b<Float, s.o>> list, s.b<Float, s.o> bVar2, tg.e<? super v> eVar) {
        super(2, eVar);
        this.f33263c = bVar;
        this.f33264d = z10;
        this.f33265e = list;
        this.f33266f = bVar2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        v vVar = new v(this.f33263c, this.f33264d, this.f33265e, this.f33266f, eVar);
        vVar.f33262b = obj;
        return vVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((v) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        if (s.b.c(r15.f33266f, r1, r2, null, r15, 12) != r6) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ph.i0 i0Var;
        Iterator it;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33261a;
        if (i10 == 0) {
            pg.q.b(obj);
            ph.i0 i0Var2 = (ph.i0) this.f33262b;
            Float f10 = new Float(1.0f);
            s.m2 m2VarD = s.m.d(250, 0, null, 6);
            this.f33262b = i0Var2;
            this.f33261a = 1;
            if (s.b.c(this.f33263c, f10, m2VarD, null, this, 12) != aVar) {
                i0Var = i0Var2;
            }
            return aVar;
        }
        if (i10 == 1) {
            i0Var = (ph.i0) this.f33262b;
            pg.q.b(obj);
        } else if (i10 == 2) {
            it = (Iterator) this.f33262b;
            pg.q.b(obj);
            while (it.hasNext()) {
                s.b bVar = (s.b) it.next();
                Float f11 = new Float(1.0f);
                this.f33262b = it;
                this.f33261a = 2;
                if (bVar.f(f11, this) == aVar) {
                    break;
                }
            }
            Float f12 = new Float(1.0f);
            s.m2 m2VarD2 = s.m.d(300, 0, null, 6);
            this.f33262b = null;
            this.f33261a = 4;
        } else {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
            Float f122 = new Float(1.0f);
            s.m2 m2VarD22 = s.m.d(300, 0, null, 6);
            this.f33262b = null;
            this.f33261a = 4;
        }
        boolean z10 = this.f33264d;
        List<s.b<Float, s.o>> list = this.f33265e;
        if (!z10) {
            int i11 = 0;
            for (Object obj2 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    qg.p.o();
                    throw null;
                }
                ph.h.c(i0Var, null, null, new a(i11, (s.b) obj2, null), 3);
                i11 = i12;
            }
            this.f33262b = null;
            this.f33261a = 3;
            if (ph.t0.b(920L, this) != aVar) {
                Float f1222 = new Float(1.0f);
                s.m2 m2VarD222 = s.m.d(300, 0, null, 6);
                this.f33262b = null;
                this.f33261a = 4;
            }
            return aVar;
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        Float f12222 = new Float(1.0f);
        s.m2 m2VarD2222 = s.m.d(300, 0, null, 6);
        this.f33262b = null;
        this.f33261a = 4;
    }
}
