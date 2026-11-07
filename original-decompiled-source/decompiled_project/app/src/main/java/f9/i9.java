package f9;

import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class i9 implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9798b;

    public /* synthetic */ i9(Object obj, int i10) {
        this.f9797a = i10;
        this.f9798b = obj;
    }

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f9797a;
        Object obj3 = this.f9798b;
        switch (i10) {
            case 0:
                x0.j jVar = (x0.j) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && jVar.s()) {
                    jVar.v();
                } else {
                    t0.ff.b(f3.q.d(R.string.editor_pasted_html, new Object[]{Integer.valueOf(((String) obj3).length())}, jVar), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar, 0, 0, 131070);
                }
                break;
            default:
                x0.j jVar2 = (x0.j) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && jVar2.s()) {
                    jVar2.v();
                } else {
                    t0.ff.b(f3.q.c(((s8.e2) obj3).f24628b, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
