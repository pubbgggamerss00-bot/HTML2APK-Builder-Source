package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.htmltoapk.template.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {
    public Context s;

    /* renamed from: t, reason: collision with root package name */
    public LayoutInflater f158t;

    /* renamed from: u, reason: collision with root package name */
    public f f159u;

    /* renamed from: v, reason: collision with root package name */
    public ExpandedMenuView f160v;

    /* renamed from: w, reason: collision with root package name */
    public j.a f161w;

    /* renamed from: x, reason: collision with root package name */
    public a f162x;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends BaseAdapter {
        public int s = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.f159u;
            h hVar = fVar.f189v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f178j;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (arrayList.get(i6) == hVar) {
                        this.s = i6;
                        return;
                    }
                }
            }
            this.s = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h getItem(int i6) {
            d dVar = d.this;
            f fVar = dVar.f159u;
            fVar.i();
            ArrayList<h> arrayList = fVar.f178j;
            dVar.getClass();
            int i7 = this.s;
            if (i7 >= 0 && i6 >= i7) {
                i6++;
            }
            return arrayList.get(i6);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.f159u;
            fVar.i();
            int size = fVar.f178j.size();
            dVar.getClass();
            return this.s < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i6) {
            return i6;
        }

        @Override // android.widget.Adapter
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.f158t.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).c(getItem(i6));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(ContextWrapper contextWrapper) {
        this.s = contextWrapper;
        this.f158t = LayoutInflater.from(contextWrapper);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z6) {
        j.a aVar = this.f161w;
        if (aVar != null) {
            aVar.b(fVar, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g(Context context, f fVar) {
        if (this.s != null) {
            this.s = context;
            if (this.f158t == null) {
                this.f158t = LayoutInflater.from(context);
            }
        }
        this.f159u = fVar;
        a aVar = this.f162x;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h() {
        a aVar = this.f162x;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j(m mVar) {
        boolean zHasVisibleItems = mVar.hasVisibleItems();
        Context context = mVar.f170a;
        if (!zHasVisibleItems) {
            return false;
        }
        g gVar = new g();
        gVar.s = mVar;
        b.a aVar = new b.a(context);
        AlertController.b bVar = aVar.f127a;
        d dVar = new d(bVar.f114a);
        gVar.f193u = dVar;
        dVar.f161w = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.f193u;
        if (dVar2.f162x == null) {
            dVar2.f162x = dVar2.new a();
        }
        bVar.f120g = dVar2.f162x;
        bVar.h = gVar;
        View view = mVar.f183o;
        if (view != null) {
            bVar.f118e = view;
        } else {
            bVar.f116c = mVar.f182n;
            bVar.f117d = mVar.f181m;
        }
        bVar.f119f = gVar;
        androidx.appcompat.app.b bVarA = aVar.a();
        gVar.f192t = bVarA;
        bVarA.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f192t.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f192t.show();
        j.a aVar2 = this.f161w;
        if (aVar2 == null) {
            return true;
        }
        aVar2.c(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j6) {
        this.f159u.q(this.f162x.getItem(i6), this, 0);
    }
}
