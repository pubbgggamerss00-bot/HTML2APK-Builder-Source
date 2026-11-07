package c2;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4687a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4688b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4689c;

    /* renamed from: d, reason: collision with root package name */
    public int f4690d;

    public r() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(List<b0> list, j jVar) {
        this.f4687a = list;
        this.f4688b = jVar;
        MotionEvent motionEvent = jVar != null ? jVar.f4652b.f4614b : null;
        int i10 = 0;
        this.f4689c = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = jVar != null ? jVar.f4652b.f4614b : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = jVar != null ? jVar.f4652b.f4614b : null;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked == 0) {
                i10 = 1;
            } else if (actionMasked == 1) {
                i10 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 7:
                        i10 = 3;
                        break;
                    case 8:
                        i10 = 6;
                        break;
                    case 9:
                        i10 = 4;
                        break;
                    case 10:
                        i10 = 5;
                        break;
                }
            }
        } else {
            int size = list.size();
            while (i10 < size) {
                b0 b0Var = list.get(i10);
                if (s.c(b0Var)) {
                    i10 = 2;
                } else if (s.a(b0Var)) {
                    i10 = 1;
                } else {
                    i10++;
                }
            }
            i10 = 3;
        }
        this.f4690d = i10;
    }
}
