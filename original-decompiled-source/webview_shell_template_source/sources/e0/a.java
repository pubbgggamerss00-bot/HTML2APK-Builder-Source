package e0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12749a;

    /* renamed from: b, reason: collision with root package name */
    public int f12750b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f12751c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<C0050a> f12752d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.d> f12753e = new SparseArray<>();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: e0.a$a, reason: collision with other inner class name */
    public static class C0050a {

        /* renamed from: a, reason: collision with root package name */
        public final int f12754a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f12755b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public final int f12756c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.constraintlayout.widget.d f12757d;

        public C0050a(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f12756c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.f12772j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    this.f12754a = typedArrayObtainStyledAttributes.getResourceId(index, this.f12754a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f12756c);
                    this.f12756c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        this.f12757d = dVar;
                        dVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f12758a;

        /* renamed from: b, reason: collision with root package name */
        public final float f12759b;

        /* renamed from: c, reason: collision with root package name */
        public final float f12760c;

        /* renamed from: d, reason: collision with root package name */
        public final float f12761d;

        /* renamed from: e, reason: collision with root package name */
        public final int f12762e;

        /* renamed from: f, reason: collision with root package name */
        public final androidx.constraintlayout.widget.d f12763f;

        public b(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f12758a = Float.NaN;
            this.f12759b = Float.NaN;
            this.f12760c = Float.NaN;
            this.f12761d = Float.NaN;
            this.f12762e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.f12774l);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f12762e);
                    this.f12762e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        this.f12763f = dVar;
                        dVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f12761d = typedArrayObtainStyledAttributes.getDimension(index, this.f12761d);
                } else if (index == 2) {
                    this.f12759b = typedArrayObtainStyledAttributes.getDimension(index, this.f12759b);
                } else if (index == 3) {
                    this.f12760c = typedArrayObtainStyledAttributes.getDimension(index, this.f12760c);
                } else if (index == 4) {
                    this.f12758a = typedArrayObtainStyledAttributes.getDimension(index, this.f12758a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f6, float f7) {
            float f8 = this.f12758a;
            if (!Float.isNaN(f8) && f6 < f8) {
                return false;
            }
            float f9 = this.f12759b;
            if (!Float.isNaN(f9) && f7 < f9) {
                return false;
            }
            float f10 = this.f12760c;
            if (!Float.isNaN(f10) && f6 > f10) {
                return false;
            }
            float f11 = this.f12761d;
            return Float.isNaN(f11) || f7 <= f11;
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i6) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        String str;
        this.f12749a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            C0050a c0050a = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                a(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                C0050a c0050a2 = new C0050a(context, xml);
                                this.f12752d.put(c0050a2.f12754a, c0050a2);
                                c0050a = c0050a2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xml);
                                if (c0050a != null) {
                                    c0050a.f12755b.add(bVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e6) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i6, e6);
        } catch (XmlPullParserException e7) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i6, e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser) throws XmlPullParserException, NumberFormatException, IOException {
        int eventType;
        d.a aVarD;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i6 = 0; i6 < attributeCount; i6++) {
            String attributeName = xmlResourceParser.getAttributeName(i6);
            String attributeValue = xmlResourceParser.getAttributeValue(i6);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    aVarD = null;
                } catch (IOException e6) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e6);
                } catch (XmlPullParserException e7) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e7);
                }
                while (eventType != 1) {
                    if (eventType == 0) {
                        xmlResourceParser.getName();
                    } else if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (aVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    aVarD.f827d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (aVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    aVarD.f826c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    aVarD = androidx.constraintlayout.widget.d.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (aVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    aVarD.f825b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (aVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    aVarD.f828e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    aVarD = androidx.constraintlayout.widget.d.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    aVarD.f827d.f841a = true;
                                    break;
                                } else {
                                    break;
                                }
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    if (aVarD != null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    androidx.constraintlayout.widget.b.a(context, xmlResourceParser, aVarD.f829f);
                                    break;
                                } else {
                                    continue;
                                }
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    aVarD = androidx.constraintlayout.widget.d.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    aVarD.f827d.f855h0 = 1;
                                    break;
                                } else {
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (aVarD != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    aVarD = androidx.constraintlayout.widget.d.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    dVar.f823c.put(Integer.valueOf(aVarD.f824a), aVarD);
                                    aVarD = null;
                                    break;
                                } else {
                                    break;
                                }
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    dVar.f823c.put(Integer.valueOf(aVarD.f824a), aVarD);
                                    aVarD = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    dVar.f823c.put(Integer.valueOf(aVarD.f824a), aVarD);
                                    aVarD = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    this.f12753e.put(identifier, dVar);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                this.f12753e.put(identifier, dVar);
                return;
            }
        }
    }
}
