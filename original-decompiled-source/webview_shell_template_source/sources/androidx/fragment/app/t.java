package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.v0;
import i1.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t implements LayoutInflater.Factory2 {
    public final y s;

    public t(y yVar) {
        this.s = yVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        e0 e0VarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        y yVar = this.s;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, yVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.a.f13273a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = k.class.isAssignableFrom(r.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    k kVarB = resourceId != -1 ? yVar.B(resourceId) : null;
                    if (kVarB == null && string != null) {
                        kVarB = yVar.C(string);
                    }
                    if (kVarB == null && id != -1) {
                        kVarB = yVar.B(id);
                    }
                    if (kVarB == null) {
                        r rVarE = yVar.E();
                        context.getClassLoader();
                        kVarB = rVarE.a(attributeValue);
                        kVarB.E = true;
                        kVarB.N = resourceId != 0 ? resourceId : id;
                        kVarB.O = id;
                        kVarB.P = string;
                        kVarB.F = true;
                        kVarB.J = yVar;
                        s<?> sVar = yVar.f1248t;
                        kVarB.K = sVar;
                        FragmentActivity fragmentActivity = sVar.f1222t;
                        kVarB.U = true;
                        if ((sVar != null ? sVar.s : null) != null) {
                            kVarB.U = true;
                        }
                        e0VarF = yVar.a(kVarB);
                        if (y.H(2)) {
                            Log.v("FragmentManager", "Fragment " + kVarB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (kVarB.F) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        kVarB.F = true;
                        kVarB.J = yVar;
                        s<?> sVar2 = yVar.f1248t;
                        kVarB.K = sVar2;
                        FragmentActivity fragmentActivity2 = sVar2.f1222t;
                        kVarB.U = true;
                        if ((sVar2 != null ? sVar2.s : null) != null) {
                            kVarB.U = true;
                        }
                        e0VarF = yVar.f(kVarB);
                        if (y.H(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + kVarB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    b.a aVar = i1.b.f13340a;
                    i1.b.b(new i1.c(kVarB, viewGroup));
                    i1.b.a(kVarB).getClass();
                    kVarB.V = viewGroup;
                    e0VarF.k();
                    e0VarF.j();
                    View view2 = kVarB.W;
                    if (view2 == null) {
                        throw new IllegalStateException(v0.b("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (kVarB.W.getTag() == null) {
                        kVarB.W.setTag(string);
                    }
                    kVarB.W.addOnAttachStateChangeListener(new a(e0VarF));
                    return kVarB.W;
                }
            }
        }
        return null;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ e0 s;

        public a(e0 e0Var) {
            this.s = e0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            e0 e0Var = this.s;
            k kVar = e0Var.f1097c;
            e0Var.k();
            j0.f((ViewGroup) kVar.W.getParent(), t.this.s.F()).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
