package c5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d5.b;

/* loaded from: classes.dex */
public final class u implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f4983a;

    public u(b0 b0Var) {
        this.f4983a = b0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        h0 h0VarF;
        boolean zEquals = q.class.getName().equals(str);
        b0 b0Var = this.f4983a;
        if (zEquals) {
            return new q(context, attributeSet, b0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5.a.f3574a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = h.class.isAssignableFrom(s.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    h hVarA = resourceId != -1 ? b0Var.A(resourceId) : null;
                    if (hVarA == null && string != null) {
                        hVarA = b0Var.B(string);
                    }
                    if (hVarA == null && id2 != -1) {
                        hVarA = b0Var.A(id2);
                    }
                    if (hVarA == null) {
                        s sVarD = b0Var.D();
                        context.getClassLoader();
                        hVarA = sVarD.a(attributeValue);
                        hVarA.f4884n = true;
                        hVarA.f4893y = resourceId != 0 ? resourceId : id2;
                        hVarA.f4894z = id2;
                        hVarA.A = string;
                        hVarA.f4885p = true;
                        hVarA.f4889t = b0Var;
                        t<?> tVar = b0Var.f4798u;
                        hVarA.f4890v = tVar;
                        n nVar = tVar.f4980b;
                        hVarA.F = true;
                        if ((tVar != null ? tVar.f4979a : null) != null) {
                            hVarA.F = true;
                        }
                        h0VarF = b0Var.a(hVarA);
                        if (b0.G(2)) {
                            Log.v("FragmentManager", "Fragment " + hVarA + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (hVarA.f4885p) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        hVarA.f4885p = true;
                        hVarA.f4889t = b0Var;
                        t<?> tVar2 = b0Var.f4798u;
                        hVarA.f4890v = tVar2;
                        n nVar2 = tVar2.f4980b;
                        hVarA.F = true;
                        if ((tVar2 != null ? tVar2.f4979a : null) != null) {
                            hVarA.F = true;
                        }
                        h0VarF = b0Var.f(hVarA);
                        if (b0.G(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + hVarA + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    b.a aVar = d5.b.f7368a;
                    d5.b.b(new d5.c(hVarA, "Attempting to use <fragment> tag to add fragment " + hVarA + " to container " + viewGroup));
                    d5.b.a(hVarA).getClass();
                    hVarA.G = viewGroup;
                    h0VarF.j();
                    h0VarF.i();
                    throw new IllegalStateException(i8.n.d("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
