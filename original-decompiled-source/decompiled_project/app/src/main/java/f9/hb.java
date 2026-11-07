package f9;

import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class hb implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9767a;

    public hb(long j10) {
        this.f9767a = j10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.ff.b(this.f9767a == 0 ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 1257607644, R.string.editor_title_new, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 1257609917, R.string.editor_title_edit, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
        }
        return pg.f0.f21461a;
    }
}
