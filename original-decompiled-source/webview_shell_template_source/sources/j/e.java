package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13394a;

    /* renamed from: b, reason: collision with root package name */
    public final j.a f13395b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f13396a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f13397b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<e> f13398c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        public final w.g<Menu, Menu> f13399d = new w.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f13397b = context;
            this.f13396a = callback;
        }

        public final e a(j.a aVar) {
            ArrayList<e> arrayList = this.f13398c;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                e eVar = arrayList.get(i6);
                if (eVar != null && eVar.f13395b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f13397b, aVar);
            arrayList.add(eVar2);
            return eVar2;
        }

        public final boolean b(j.a aVar, MenuItem menuItem) {
            return this.f13396a.onActionItemClicked(a(aVar), new k.c(this.f13397b, (o0.b) menuItem));
        }

        public final boolean c(j.a aVar, Menu menu) {
            e eVarA = a(aVar);
            w.g<Menu, Menu> gVar = this.f13399d;
            Menu eVar = gVar.get(menu);
            if (eVar == null) {
                eVar = new k.e(this.f13397b, (o0.a) menu);
                gVar.put(menu, eVar);
            }
            return this.f13396a.onCreateActionMode(eVarA, eVar);
        }
    }

    public e(Context context, j.a aVar) {
        this.f13394a = context;
        this.f13395b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f13395b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f13395b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new k.e(this.f13394a, this.f13395b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f13395b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f13395b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f13395b.s;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f13395b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f13395b.f13381t;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f13395b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f13395b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f13395b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f13395b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f13395b.s = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f13395b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z6) {
        this.f13395b.p(z6);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i6) {
        this.f13395b.l(i6);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i6) {
        this.f13395b.n(i6);
    }
}
