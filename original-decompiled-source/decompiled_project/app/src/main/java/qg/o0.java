package qg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o0 extends vg.h implements eh.p<lh.i<? super List<Object>>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f22741a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f22742b;

    /* renamed from: c, reason: collision with root package name */
    public int f22743c;

    /* renamed from: d, reason: collision with root package name */
    public int f22744d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f22745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Iterator<Object> f22746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Iterator it, tg.e eVar) {
        super(2, eVar);
        this.f22746f = it;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        o0 o0Var = new o0(this.f22746f, eVar);
        o0Var.f22745e = obj;
        return o0Var;
    }

    @Override // eh.p
    public final Object invoke(lh.i<? super List<Object>> iVar, tg.e<? super pg.f0> eVar) {
        return ((o0) create(iVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        lh.i iVar;
        ArrayList arrayList;
        Iterator<Object> it;
        int i10;
        m0 m0Var;
        lh.i iVar2;
        Object[] array;
        ug.a aVar = ug.a.f29706a;
        int i11 = this.f22744d;
        if (i11 == 0) {
            pg.q.b(obj);
            iVar = (lh.i) this.f22745e;
            arrayList = new ArrayList(20);
            it = this.f22746f;
            i10 = 0;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    pg.q.b(obj);
                } else {
                    if (i11 == 3) {
                        Iterator it2 = this.f22742b;
                        m0 m0Var2 = (m0) this.f22741a;
                        lh.i iVar3 = (lh.i) this.f22745e;
                        pg.q.b(obj);
                        m0Var2.e();
                        while (true) {
                            int i12 = m0Var2.f22734b;
                            Object[] objArr = m0Var2.f22733a;
                            if (!it2.hasNext()) {
                                m0Var = m0Var2;
                                iVar2 = iVar3;
                                break;
                            }
                            Object next = it2.next();
                            if (m0Var2.c() == i12) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i13 = m0Var2.f22735c;
                            int i14 = m0Var2.f22736d;
                            objArr[(i13 + i14) % i12] = next;
                            m0Var2.f22736d = i14 + 1;
                            if (m0Var2.c() == i12) {
                                if (m0Var2.f22736d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(m0Var2);
                                    this.f22745e = iVar3;
                                    this.f22741a = m0Var2;
                                    this.f22742b = it2;
                                    this.f22744d = 3;
                                    iVar3.c(arrayList2, this);
                                    ug.a aVar2 = ug.a.f29706a;
                                    return aVar;
                                }
                                int i15 = i12 + (i12 >> 1) + 1;
                                if (i15 > 20) {
                                    i15 = 20;
                                }
                                if (m0Var2.f22735c == 0) {
                                    array = Arrays.copyOf(objArr, i15);
                                    kotlin.jvm.internal.r.d(array, "copyOf(...)");
                                } else {
                                    array = m0Var2.toArray(new Object[i15]);
                                }
                                m0Var2 = new m0(array, m0Var2.f22736d);
                            }
                        }
                    } else if (i11 != 4) {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                    } else {
                        m0Var = (m0) this.f22741a;
                        iVar2 = (lh.i) this.f22745e;
                        pg.q.b(obj);
                        m0Var.e();
                    }
                    if (m0Var.f22736d > 20) {
                        ArrayList arrayList3 = new ArrayList(m0Var);
                        this.f22745e = iVar2;
                        this.f22741a = m0Var;
                        this.f22742b = null;
                        this.f22744d = 4;
                        iVar2.c(arrayList3, this);
                        ug.a aVar3 = ug.a.f29706a;
                        return aVar;
                    }
                    if (!m0Var.isEmpty()) {
                        this.f22745e = null;
                        this.f22741a = null;
                        this.f22742b = null;
                        this.f22744d = 5;
                        iVar2.c(m0Var, this);
                        ug.a aVar4 = ug.a.f29706a;
                        return aVar;
                    }
                }
                return pg.f0.f21461a;
            }
            i10 = this.f22743c;
            it = this.f22742b;
            iVar = (lh.i) this.f22745e;
            pg.q.b(obj);
            arrayList = new ArrayList(20);
        }
        lh.i iVar4 = iVar;
        Iterator<Object> it3 = it;
        int i16 = i10;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f22745e = iVar4;
                    this.f22741a = arrayList;
                    this.f22742b = it3;
                    this.f22743c = i16;
                    this.f22744d = 1;
                    iVar4.c(arrayList, this);
                    ug.a aVar5 = ug.a.f29706a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f22745e = null;
            this.f22741a = null;
            this.f22742b = null;
            this.f22744d = 2;
            iVar4.c(arrayList, this);
            ug.a aVar6 = ug.a.f29706a;
            return aVar;
        }
        return pg.f0.f21461a;
    }
}
