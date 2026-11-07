package j0;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.a0;
import c2.b0;
import c2.c;
import c2.j0;
import c2.r;
import c2.s0;
import c2.t;
import c2.u0;
import c2.y0;
import com.yalantis.ucrop.view.CropImageView;
import eh.p;
import f3.i;
import i2.i2;
import i2.k;
import i2.m;
import i2.m2;
import o1.e0;
import o1.h;
import o1.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import pg.q;
import q1.g0;
import v.c0;
import v.t1;
import vg.e;

/* loaded from: classes.dex */
public final class a extends m implements i2, h, e0 {

    /* renamed from: s, reason: collision with root package name */
    public eh.a<f0> f14586s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14587t;

    /* renamed from: v, reason: collision with root package name */
    public final u0 f14588v;

    /* renamed from: j0.a$a, reason: collision with other inner class name */
    public static final class C0139a implements PointerInputEventHandler {

        @e(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {105, 133, 171}, m = "invokeSuspend")
        /* renamed from: j0.a$a$a, reason: collision with other inner class name */
        public static final class C0140a extends vg.h implements p<c, tg.e<? super f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public b0 f14590a;

            /* renamed from: b, reason: collision with root package name */
            public t f14591b;

            /* renamed from: c, reason: collision with root package name */
            public int f14592c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f14593d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f14594e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0140a(a aVar, tg.e<? super C0140a> eVar) {
                super(2, eVar);
                this.f14594e = aVar;
            }

            @Override // vg.a
            public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
                C0140a c0140a = new C0140a(this.f14594e, eVar);
                c0140a.f14593d = obj;
                return c0140a;
            }

            @Override // eh.p
            public final Object invoke(c cVar, tg.e<? super f0> eVar) {
                return ((C0140a) create(cVar, eVar)).invokeSuspend(f0.f21461a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
            
                if (r9 == r1) goto L147;
             */
            /* JADX WARN: Code restructure failed: missing block: B:146:0x024a, code lost:
            
                if (r4 != r1) goto L148;
             */
            /* JADX WARN: Code restructure failed: missing block: B:147:0x024c, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:195:0x01b7, code lost:
            
                continue;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
            
                if (r5 == r1) goto L147;
             */
            /* JADX WARN: Path cross not found for [B:29:0x00a3, B:24:0x0082], limit reached: 199 */
            /* JADX WARN: Path cross not found for [B:32:0x00a8, B:35:0x00ae], limit reached: 199 */
            /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, java.util.Collection, java.util.List] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x024a -> B:148:0x024d). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00be -> B:40:0x00c2). Please report as a decompilation issue!!! */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                c cVar;
                Object objB;
                b0 b0Var;
                boolean z10;
                c cVar2;
                t tVar;
                Object objC1;
                a aVar;
                Object obj2;
                b0 b0Var2;
                c cVar3;
                Object obj3;
                Object objC12;
                Object obj4;
                ug.a aVar2 = ug.a.f29706a;
                int i10 = this.f14592c;
                int i11 = 2;
                a aVar3 = this.f14594e;
                if (i10 == 0) {
                    q.b(obj);
                    cVar = (c) this.f14593d;
                    t tVar2 = t.f4694a;
                    this.f14593d = cVar;
                    this.f14592c = 1;
                    objB = t1.b(cVar, true, tVar2, this);
                } else if (i10 == 1) {
                    cVar = (c) this.f14593d;
                    q.b(obj);
                    objB = obj;
                } else if (i10 == 2) {
                    tVar = this.f14591b;
                    b0Var = this.f14590a;
                    cVar2 = (c) this.f14593d;
                    q.b(obj);
                    objC1 = obj;
                    r rVar = (r) objC1;
                    ?? r62 = rVar.f4687a;
                    int size = r62.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            aVar = aVar3;
                            obj2 = null;
                            break;
                        }
                        obj2 = r62.get(i12);
                        b0 b0Var3 = (b0) obj2;
                        if (!b0Var3.b()) {
                            aVar = aVar3;
                            if (a0.b(b0Var3.f4593a, b0Var.f4593a) && b0Var3.f4596d) {
                                break;
                            }
                        } else {
                            aVar = aVar3;
                        }
                        i12++;
                        aVar3 = aVar;
                    }
                    b0 b0Var4 = (b0) obj2;
                    if (b0Var4 == null || b0Var4.f4594b - b0Var.f4594b >= cVar2.getViewConfiguration().b() || g0.a(rVar)) {
                        b0Var4 = null;
                    } else if (p1.c.c(p1.c.f(b0Var4.f4595c, b0Var.f4595c)) <= cVar2.getViewConfiguration().c()) {
                        aVar3 = aVar;
                        i11 = 2;
                        this.f14593d = cVar2;
                        this.f14590a = b0Var;
                        this.f14591b = tVar;
                        this.f14592c = i11;
                        objC1 = cVar2.C1(tVar, this);
                    }
                    if (b0Var4 == null) {
                        return f0.f21461a;
                    }
                    a aVar4 = aVar;
                    if (!aVar4.f14587t) {
                        d.c cVarB = aVar4.f1144a;
                        z0.b bVar = null;
                        while (true) {
                            o1.f0 f0Var = o1.f0.f18861a;
                            if (cVarB == null) {
                                if (!aVar4.f1144a.f1157p) {
                                    f2.a.b("visitChildren called on an unattached node");
                                }
                                z0.b bVar2 = new z0.b(new d.c[16]);
                                d.c cVar4 = aVar4.f1144a;
                                d.c cVar5 = cVar4.f1149f;
                                if (cVar5 == null) {
                                    k.a(bVar2, cVar4);
                                } else {
                                    bVar2.b(cVar5);
                                }
                                while (true) {
                                    int i13 = bVar2.f34702c;
                                    if (i13 == 0) {
                                        break;
                                    }
                                    d.c cVarB2 = (d.c) bVar2.k(i13 - 1);
                                    if ((cVarB2.f1147d & 1024) == 0) {
                                        k.a(bVar2, cVarB2);
                                    } else {
                                        while (true) {
                                            if (cVarB2 == null) {
                                                break;
                                            }
                                            if ((cVarB2.f1146c & 1024) != 0) {
                                                z0.b bVar3 = null;
                                                while (cVarB2 != null) {
                                                    if (cVarB2 instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode = (FocusTargetNode) cVarB2;
                                                        if (focusTargetNode.U1().f18909a) {
                                                            focusTargetNode.H(7);
                                                        } else {
                                                            i.g(focusTargetNode, 7, f0Var);
                                                        }
                                                    } else if ((cVarB2.f1146c & 1024) == 0 || !(cVarB2 instanceof m)) {
                                                        cVarB2 = k.b(bVar3);
                                                    } else {
                                                        int i14 = 0;
                                                        for (d.c cVar6 = ((m) cVarB2).f13947r; cVar6 != null; cVar6 = cVar6.f1149f) {
                                                            if ((cVar6.f1146c & 1024) != 0) {
                                                                i14++;
                                                                if (i14 == 1) {
                                                                    cVarB2 = cVar6;
                                                                } else {
                                                                    if (bVar3 == null) {
                                                                        bVar3 = new z0.b(new d.c[16]);
                                                                    }
                                                                    if (cVarB2 != null) {
                                                                        bVar3.b(cVarB2);
                                                                        cVarB2 = null;
                                                                    }
                                                                    bVar3.b(cVar6);
                                                                }
                                                            }
                                                        }
                                                        if (i14 != 1) {
                                                            cVarB2 = k.b(bVar3);
                                                        }
                                                    }
                                                }
                                            } else {
                                                cVarB2 = cVarB2.f1149f;
                                            }
                                        }
                                    }
                                }
                            } else if (cVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                if (focusTargetNode2.U1().f18909a) {
                                    focusTargetNode2.H(7);
                                } else {
                                    i.g(focusTargetNode2, 7, f0Var);
                                }
                            } else {
                                if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof m)) {
                                    int i15 = 0;
                                    for (d.c cVar7 = ((m) cVarB).f13947r; cVar7 != null; cVar7 = cVar7.f1149f) {
                                        if ((cVar7.f1146c & 1024) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                cVarB = cVar7;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new z0.b(new d.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    bVar.b(cVarB);
                                                    cVarB = null;
                                                }
                                                bVar.b(cVar7);
                                            }
                                        }
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                cVarB = k.b(bVar);
                            }
                        }
                    }
                    aVar4.f14586s.invoke();
                    b0Var4.a();
                    b0Var2 = b0Var;
                    cVar3 = cVar2;
                    t tVar3 = t.f4694a;
                    this.f14593d = cVar3;
                    this.f14590a = b0Var2;
                    obj3 = null;
                    this.f14591b = null;
                    this.f14592c = 3;
                    objC12 = cVar3.C1(tVar3, this);
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b0Var2 = this.f14590a;
                    cVar3 = (c) this.f14593d;
                    q.b(obj);
                    objC12 = obj;
                    obj3 = null;
                    ?? r42 = ((r) objC12).f4687a;
                    int size2 = r42.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size2) {
                            obj4 = obj3;
                            break;
                        }
                        obj4 = r42.get(i16);
                        b0 b0Var5 = (b0) obj4;
                        if (!b0Var5.b() && a0.b(b0Var5.f4593a, b0Var2.f4593a) && b0Var5.f4596d) {
                            break;
                        }
                        i16++;
                    }
                    b0 b0Var6 = (b0) obj4;
                    if (b0Var6 == null) {
                        return f0.f21461a;
                    }
                    b0Var6.a();
                    t tVar32 = t.f4694a;
                    this.f14593d = cVar3;
                    this.f14590a = b0Var2;
                    obj3 = null;
                    this.f14591b = null;
                    this.f14592c = 3;
                    objC12 = cVar3.C1(tVar32, this);
                }
                b0Var = (b0) objB;
                int i17 = b0Var.f4601i;
                long j10 = b0Var.f4595c;
                if (i17 != 3 && i17 != 4) {
                    return f0.f21461a;
                }
                int i18 = (int) (j10 >> 32);
                if (Float.intBitsToFloat(i18) >= CropImageView.DEFAULT_ASPECT_RATIO && Float.intBitsToFloat(i18) < ((int) (cVar.a() >> 32))) {
                    int i19 = (int) (j10 & BodyPartID.bodyIdMax);
                    if (Float.intBitsToFloat(i19) >= CropImageView.DEFAULT_ASPECT_RATIO && Float.intBitsToFloat(i19) < ((int) (BodyPartID.bodyIdMax & cVar.a()))) {
                        z10 = true;
                    }
                    cVar2 = cVar;
                    tVar = (!aVar3.f14587t || z10) ? t.f4694a : t.f4695b;
                    this.f14593d = cVar2;
                    this.f14590a = b0Var;
                    this.f14591b = tVar;
                    this.f14592c = i11;
                    objC1 = cVar2.C1(tVar, this);
                }
                z10 = false;
                cVar2 = cVar;
                tVar = (!aVar3.f14587t || z10) ? t.f4694a : t.f4695b;
                this.f14593d = cVar2;
                this.f14590a = b0Var;
                this.f14591b = tVar;
                this.f14592c = i11;
                objC1 = cVar2.C1(tVar, this);
            }
        }

        public C0139a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(j0 j0Var, tg.e<? super f0> eVar) {
            Object objC = c0.c(j0Var, new C0140a(a.this, null), eVar);
            return objC == ug.a.f29706a ? objC : f0.f21461a;
        }
    }

    public a(eh.a<f0> aVar) {
        this.f14586s = aVar;
        C0139a c0139a = new C0139a();
        r rVar = s0.f4692a;
        y0 y0Var = new y0(null, null, c0139a);
        T1(y0Var);
        this.f14588v = y0Var;
    }

    @Override // i2.i2
    public final void J(r rVar, t tVar, long j10) {
        this.f14588v.J(rVar, tVar, j10);
    }

    @Override // i2.i2
    public final long N() {
        i2.q qVar = androidx.compose.foundation.text.handwriting.a.f1055a;
        f3.d dVar = k.f(this).B;
        qVar.getClass();
        int i10 = m2.f13957b;
        return m2.a.b(dVar.b1(qVar.f14001a), dVar.b1(qVar.f14002b), dVar.b1(qVar.f14003c), dVar.b1(qVar.f14004d));
    }

    @Override // o1.h
    public final void Q(i0 i0Var) {
        this.f14587t = i0Var.b();
    }

    @Override // i2.i2
    public final void r0() {
        this.f14588v.r0();
    }
}
