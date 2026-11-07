package k8;

import eh.p;
import hh.c;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import pg.f0;
import pg.q;
import ph.i0;
import ph.j0;
import ph.t0;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.data.catgame.CatGameManager$startGameLoop$1", f = "CatGameManager.kt", l = {726}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f16090a;

    /* renamed from: b, reason: collision with root package name */
    public int f16091b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f16093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, tg.e<? super g> eVar) {
        super(2, eVar);
        this.f16093d = hVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        g gVar = new g(this.f16093d, eVar);
        gVar.f16092c = obj;
        return gVar;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((g) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Path cross not found for [B:35:0x0104, B:68:0x01ec], limit reached: 90 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:15:0x0047). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i0 i0Var;
        int i10;
        z0 z0Var;
        Object value;
        i iVar;
        jh.i iVar2;
        c.a random;
        Object obj2;
        z0 z0Var2;
        int i11;
        g gVar = this;
        h hVar = gVar.f16093d;
        z0 z0Var3 = hVar.f16108o;
        z0 z0Var4 = hVar.f16106m;
        z0 z0Var5 = hVar.f16096c;
        z0 z0Var6 = hVar.f16112s;
        z0 z0Var7 = hVar.f16110q;
        ug.a aVar = ug.a.f29706a;
        int i12 = gVar.f16091b;
        long j10 = 1000;
        int i13 = 1;
        if (i12 == 0) {
            q.b(obj);
            i0Var = (i0) gVar.f16092c;
            i10 = 0;
            if (j0.d(i0Var)) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = gVar.f16090a;
            i0Var = (i0) gVar.f16092c;
            q.b(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = j10;
            z0 z0Var8 = hVar.f16100g;
            int i14 = i13;
            Integer num = new Integer(h.a(hVar, hVar.f16114u, jCurrentTimeMillis));
            z0Var8.getClass();
            z0Var8.j(null, num);
            z0 z0Var9 = hVar.f16102i;
            Integer num2 = new Integer(h.a(hVar, hVar.f16115v, jCurrentTimeMillis));
            z0Var9.getClass();
            z0Var9.j(null, num2);
            z0 z0Var10 = hVar.f16104k;
            Integer num3 = new Integer(h.a(hVar, hVar.f16116w, jCurrentTimeMillis));
            z0Var10.getClass();
            z0Var10.j(null, num3);
            long j12 = hVar.f16117x;
            if (jCurrentTimeMillis <= j12) {
                Integer num4 = new Integer((int) ((j12 - jCurrentTimeMillis) / j11));
                z0Var3.getClass();
                z0Var3.j(null, num4);
            } else {
                if (((Number) z0Var4.getValue()).intValue() != 0) {
                    i11 = 0;
                    Integer num5 = new Integer(0);
                    z0Var4.getClass();
                    z0Var4.j(null, num5);
                } else {
                    i11 = 0;
                }
                Integer num6 = new Integer(i11);
                z0Var3.getClass();
                z0Var3.j(null, num6);
            }
            if (((Boolean) z0Var7.getValue()).booleanValue() && jCurrentTimeMillis > hVar.f16118y) {
                Boolean bool = Boolean.FALSE;
                z0Var7.getClass();
                z0Var7.j(null, bool);
            }
            if (((Boolean) z0Var6.getValue()).booleanValue() && jCurrentTimeMillis > hVar.f16119z) {
                Boolean bool2 = Boolean.FALSE;
                z0Var6.getClass();
                z0Var6.j(null, bool2);
            }
            if (jCurrentTimeMillis >= hVar.A || ((Boolean) z0Var7.getValue()).booleanValue() || ((Boolean) z0Var6.getValue()).booleanValue()) {
                z0Var = z0Var3;
            } else {
                try {
                    double d10 = 0.0d;
                    for (Map.Entry<String, Integer> entry : ((i) z0Var5.getValue()).f16133n.entrySet()) {
                        String key = entry.getKey();
                        int iIntValue = entry.getValue().intValue();
                        Iterator<T> it = e.f16084c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            Object next = it.next();
                            if (((a) next).f16056a.equals(key)) {
                                obj2 = next;
                                break;
                            }
                        }
                        a aVar2 = (a) obj2;
                        if (aVar2 == null || iIntValue <= 0) {
                            z0Var2 = z0Var3;
                        } else {
                            z0Var2 = z0Var3;
                            d10 = (aVar2.f16065j * iIntValue) + d10;
                        }
                        z0Var3 = z0Var2;
                    }
                    z0Var = z0Var3;
                    if (d10 > 0.4d) {
                        d10 = 0.4d;
                    }
                    double dK = jh.j.k(1.0d - d10, 0.5d, 1.0d);
                    if (Math.random() < 0.5d) {
                        Boolean bool3 = Boolean.TRUE;
                        z0Var7.getClass();
                        z0Var7.j(null, bool3);
                        hVar.f16118y = 15000 + jCurrentTimeMillis;
                    } else {
                        Boolean bool4 = Boolean.TRUE;
                        z0Var6.getClass();
                        z0Var6.j(null, bool4);
                        hVar.f16119z = 15000 + jCurrentTimeMillis;
                    }
                    hVar.A = jCurrentTimeMillis + ((long) (g7.i0.e(random, iVar2) * dK));
                } catch (IllegalArgumentException e10) {
                    throw new NoSuchElementException(e10.getMessage());
                }
                iVar2 = new jh.i(45000L, 80000L);
                random = hh.c.f13027a;
                r.e(random, "random");
            }
            double dC = hVar.c((i) z0Var5.getValue());
            if (dC > 0.0d) {
                long j13 = (long) dC;
                do {
                    value = z0Var5.getValue();
                    iVar = (i) value;
                } while (!z0Var5.a(value, i.a(iVar, iVar.f16120a + j13, 0L, 0, iVar.f16123d + j13, 0, 0L, 0, 0, 0L, null, null, null, null, null, 65526)));
            }
            i10++;
            if (i10 < 6) {
                hVar.j();
                gVar = this;
                i13 = i14;
                j10 = j11;
                z0Var3 = z0Var;
                i10 = 0;
                if (j0.d(i0Var)) {
                    gVar.f16092c = i0Var;
                    gVar.f16090a = i10;
                    gVar.f16091b = i13;
                    if (t0.b(j10, gVar) == aVar) {
                        return aVar;
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    long j112 = j10;
                    z0 z0Var82 = hVar.f16100g;
                    int i142 = i13;
                    Integer num7 = new Integer(h.a(hVar, hVar.f16114u, jCurrentTimeMillis2));
                    z0Var82.getClass();
                    z0Var82.j(null, num7);
                    z0 z0Var92 = hVar.f16102i;
                    Integer num22 = new Integer(h.a(hVar, hVar.f16115v, jCurrentTimeMillis2));
                    z0Var92.getClass();
                    z0Var92.j(null, num22);
                    z0 z0Var102 = hVar.f16104k;
                    Integer num32 = new Integer(h.a(hVar, hVar.f16116w, jCurrentTimeMillis2));
                    z0Var102.getClass();
                    z0Var102.j(null, num32);
                    long j122 = hVar.f16117x;
                    if (jCurrentTimeMillis2 <= j122) {
                    }
                    if (((Boolean) z0Var7.getValue()).booleanValue()) {
                        Boolean bool5 = Boolean.FALSE;
                        z0Var7.getClass();
                        z0Var7.j(null, bool5);
                    }
                    if (((Boolean) z0Var6.getValue()).booleanValue()) {
                        Boolean bool22 = Boolean.FALSE;
                        z0Var6.getClass();
                        z0Var6.j(null, bool22);
                    }
                    if (jCurrentTimeMillis2 >= hVar.A) {
                    }
                    z0Var = z0Var3;
                    double dC2 = hVar.c((i) z0Var5.getValue());
                    if (dC2 > 0.0d) {
                    }
                    i10++;
                    if (i10 < 6) {
                        gVar = this;
                        i13 = i142;
                        j10 = j112;
                        z0Var3 = z0Var;
                        if (j0.d(i0Var)) {
                            return f0.f21461a;
                        }
                    }
                }
            }
        }
    }
}
