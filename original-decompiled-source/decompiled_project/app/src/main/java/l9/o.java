package l9;

import android.content.ClipData;
import android.content.Context;

@vg.e(c = "com.basitce.htmltoapk.util.ClipboardTextKt$readClipboardText$2", f = "ClipboardText.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends vg.i implements eh.p<ph.i0, tg.e<? super n>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f16859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClipData.Item f16860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, ClipData.Item item, tg.e eVar) {
        super(2, eVar);
        this.f16859a = context;
        this.f16860b = item;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new o(this.f16859a, this.f16860b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super n> eVar) {
        return ((o) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        return p.a(this.f16859a, this.f16860b);
    }
}
