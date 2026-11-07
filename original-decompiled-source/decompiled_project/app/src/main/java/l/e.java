package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.view.menu.a f16498a;

    /* renamed from: b, reason: collision with root package name */
    public int f16499b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16500c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16501d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f16502e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16503f;

    public e(androidx.appcompat.view.menu.a aVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f16501d = z10;
        this.f16502e = layoutInflater;
        this.f16498a = aVar;
        this.f16503f = i10;
        a();
    }

    public final void a() {
        androidx.appcompat.view.menu.a aVar = this.f16498a;
        f fVar = aVar.f638s;
        if (fVar != null) {
            aVar.i();
            ArrayList<f> arrayList = aVar.f629j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == fVar) {
                    this.f16499b = i10;
                    return;
                }
            }
        }
        this.f16499b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f getItem(int i10) {
        ArrayList<f> arrayListK;
        boolean z10 = this.f16501d;
        androidx.appcompat.view.menu.a aVar = this.f16498a;
        if (z10) {
            aVar.i();
            arrayListK = aVar.f629j;
        } else {
            arrayListK = aVar.k();
        }
        int i11 = this.f16499b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayListK.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<f> arrayListK;
        boolean z10 = this.f16501d;
        androidx.appcompat.view.menu.a aVar = this.f16498a;
        if (z10) {
            aVar.i();
            arrayListK = aVar.f629j;
        } else {
            arrayListK = aVar.k();
        }
        return this.f16499b < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f16502e.inflate(this.f16503f, viewGroup, false);
        }
        int i11 = getItem(i10).f16505b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f16505b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f16498a.l() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        k kVar = (k) view;
        if (this.f16500c) {
            listMenuItemView.setForceShowIcon(true);
        }
        kVar.b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
