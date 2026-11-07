package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends BaseAdapter {
    public final f s;

    /* renamed from: t, reason: collision with root package name */
    public int f164t = -1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f165u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f166v;

    /* renamed from: w, reason: collision with root package name */
    public final LayoutInflater f167w;

    /* renamed from: x, reason: collision with root package name */
    public final int f168x;

    public e(f fVar, LayoutInflater layoutInflater, boolean z6, int i6) {
        this.f166v = z6;
        this.f167w = layoutInflater;
        this.s = fVar;
        this.f168x = i6;
        b();
    }

    public final void b() {
        f fVar = this.s;
        h hVar = fVar.f189v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f178j;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (arrayList.get(i6) == hVar) {
                    this.f164t = i6;
                    return;
                }
            }
        }
        this.f164t = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h getItem(int i6) {
        ArrayList<h> arrayListL;
        boolean z6 = this.f166v;
        f fVar = this.s;
        if (z6) {
            fVar.i();
            arrayListL = fVar.f178j;
        } else {
            arrayListL = fVar.l();
        }
        int i7 = this.f164t;
        if (i7 >= 0 && i6 >= i7) {
            i6++;
        }
        return arrayListL.get(i6);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> arrayListL;
        boolean z6 = this.f166v;
        f fVar = this.s;
        if (z6) {
            fVar.i();
            arrayListL = fVar.f178j;
        } else {
            arrayListL = fVar.l();
        }
        return this.f164t < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        boolean z6 = false;
        if (view == null) {
            view = this.f167w.inflate(this.f168x, viewGroup, false);
        }
        int i7 = getItem(i6).f195b;
        int i8 = i6 - 1;
        int i9 = i8 >= 0 ? getItem(i8).f195b : i7;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.s.m() && i7 != i9) {
            z6 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z6);
        k.a aVar = (k.a) view;
        if (this.f165u) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i6));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
