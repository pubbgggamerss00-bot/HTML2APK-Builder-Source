package cf;

import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a extends b implements Iterable<b>, v {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5416b = new ArrayList();

    public final float[] D0() {
        int size = this.f5416b.size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            b bVarL0 = l0(i10);
            fArr[i10] = bVarL0 instanceof n ? ((n) bVarL0).g0() : CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return fArr;
    }

    @Override // cf.b
    public final Object f0(gf.b bVar) throws IOException {
        bVar.f12056d.write(gf.b.I);
        Iterator it = this.f5416b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2 instanceof d) {
                if (bVar2.f5417a) {
                    bVar.M((d) bVar2);
                } else {
                    bVar.h(bVar2);
                    bVar.Z(bVar2);
                }
            } else if (bVar2 instanceof o) {
                b bVar3 = ((o) bVar2).f5549b;
                if (bVar.f12068r || (bVar3 instanceof d) || bVar3 == null) {
                    bVar.h(bVar2);
                    bVar.Z(bVar2);
                } else {
                    bVar3.f0(bVar);
                }
            } else if (bVar2 == null) {
                m.f5548c.f0(bVar);
            } else {
                bVar2.f0(bVar);
            }
            i10++;
            if (it.hasNext()) {
                if (i10 % 10 == 0) {
                    bVar.f12056d.h();
                } else {
                    bVar.f12056d.write(gf.b.f12049w);
                }
            }
        }
        bVar.f12056d.write(gf.b.K);
        bVar.f12056d.h();
        return null;
    }

    public final void g0(b bVar) {
        this.f5416b.add(bVar);
    }

    public final b i0(int i10) {
        return (b) this.f5416b.get(i10);
    }

    @Override // java.lang.Iterable
    public final Iterator<b> iterator() {
        return this.f5416b.iterator();
    }

    public final int k0(int i10, int i11) {
        ArrayList arrayList = this.f5416b;
        if (i10 < arrayList.size()) {
            Object obj = arrayList.get(i10);
            if (obj instanceof n) {
                return ((n) obj).k0();
            }
        }
        return i11;
    }

    public final b l0(int i10) {
        b bVar = (b) this.f5416b.get(i10);
        if (bVar instanceof o) {
            bVar = ((o) bVar).f5549b;
        }
        if (bVar instanceof m) {
            return null;
        }
        return bVar;
    }

    public final b q0(int i10) {
        return (b) this.f5416b.remove(i10);
    }

    public final String toString() {
        return "COSArray{" + this.f5416b + "}";
    }

    public final boolean v0(b bVar) {
        return this.f5416b.remove(bVar);
    }

    public final void y0(int i10, b bVar) {
        this.f5416b.set(i10, bVar);
    }
}
