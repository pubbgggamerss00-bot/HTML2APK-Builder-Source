package x8;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class r8 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8 f33132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1.a f33133b;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.ProjectReorderStateKt$projectReordering$1$1$1", f = "ProjectReorderState.kt", l = {193, 194, 201}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public c2.b0 f33134a;

        /* renamed from: b, reason: collision with root package name */
        public int f33135b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f33136c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n8 f33137d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y1.a f33138e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n8 n8Var, y1.a aVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f33137d = n8Var;
            this.f33138e = aVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f33137d, this.f33138e, eVar);
            aVar.f33136c = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        
            if (r4 == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
        
            if (r3 != r0) goto L48;
         */
        /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
        /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Iterable, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x010a -> B:48:0x010d). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c2.c cVar;
            Object objC;
            Object objC2;
            Object next;
            c2.c cVar2;
            c2.b0 b0Var;
            Object objC1;
            Object next2;
            int i10;
            ug.a aVar = ug.a.f29706a;
            int i11 = this.f33135b;
            n8 n8Var = this.f33137d;
            if (i11 == 0) {
                pg.q.b(obj);
                cVar = (c2.c) this.f33136c;
                this.f33136c = cVar;
                this.f33135b = 1;
                objC = v.t1.c(cVar, this, 2);
                if (objC != aVar) {
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    cVar = (c2.c) this.f33136c;
                    pg.q.b(obj);
                    objC2 = obj;
                    c2.b0 b0Var2 = (c2.b0) objC2;
                    if (b0Var2 == null) {
                        return pg.f0.f21461a;
                    }
                    long j10 = b0Var2.f4595c;
                    c0.w0 w0Var = n8Var.f32988a;
                    long jF = p1.c.f(j10, (Float.floatToRawIntBits(w0Var.i().d()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32));
                    Iterator<T> it = w0Var.i().i().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (n8.b((c0.o) next, jF)) {
                            break;
                        }
                    }
                    c0.o oVar = (c0.o) next;
                    if (oVar != null) {
                        Object key = oVar.getKey();
                        Long l10 = key instanceof Long ? (Long) key : null;
                        if (l10 != null && ((List) n8Var.f32989b.invoke()).contains(l10)) {
                            n8Var.f32996i.setValue(null);
                            n8Var.f32998k.setValue(new p1.c(n8.a(oVar)));
                            n8Var.f32999l = null;
                            n8Var.f32995h.setValue(l10);
                            this.f33138e.a(0);
                            cVar2 = cVar;
                            b0Var = b0Var2;
                            c2.t tVar = c2.t.f4694a;
                            this.f33136c = cVar2;
                            this.f33134a = b0Var;
                            this.f33135b = 3;
                            objC1 = cVar2.C1(tVar, this);
                        }
                    }
                    return pg.f0.f21461a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b0Var = this.f33134a;
                cVar2 = (c2.c) this.f33136c;
                try {
                    pg.q.b(obj);
                    objC1 = obj;
                    c2.r rVar = (c2.r) objC1;
                    Iterator it2 = rVar.f4687a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (b0.a0.b(((c2.b0) next2).f4593a, b0Var.f4593a)) {
                            break;
                        }
                    }
                    c2.b0 b0Var3 = (c2.b0) next2;
                    if (b0Var3 != null) {
                        if (c2.s.c(b0Var3)) {
                            b0Var3.a();
                            n8Var.d(false);
                        } else if (b0Var3.f4596d) {
                            ?? r32 = rVar.f4687a;
                            if (r32 == 0 || !r32.isEmpty()) {
                                Iterator it3 = r32.iterator();
                                i10 = 0;
                                while (it3.hasNext()) {
                                    if (((c2.b0) it3.next()).f4596d && (i10 = i10 + 1) < 0) {
                                        qg.p.n();
                                        throw null;
                                    }
                                }
                            } else {
                                i10 = 0;
                            }
                            if (i10 == 1) {
                                long jE = c2.s.e(b0Var3, false);
                                b0Var3.a();
                                n8Var.c(jE);
                                c2.t tVar2 = c2.t.f4694a;
                                this.f33136c = cVar2;
                                this.f33134a = b0Var;
                                this.f33135b = 3;
                                objC1 = cVar2.C1(tVar2, this);
                            }
                        }
                    }
                    n8Var.d(true);
                    return pg.f0.f21461a;
                } catch (Throwable th2) {
                    n8Var.d(true);
                    throw th2;
                }
            }
            cVar = (c2.c) this.f33136c;
            pg.q.b(obj);
            objC = obj;
            long j11 = ((c2.b0) objC).f4593a;
            this.f33136c = cVar;
            this.f33135b = 2;
            objC2 = v.u.c(cVar, j11, this);
        }
    }

    public r8(n8 n8Var, y1.a aVar) {
        this.f33132a = n8Var;
        this.f33133b = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        Object objC = v.c0.c(j0Var, new a(this.f33132a, this.f33133b, null), eVar);
        return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
    }
}
