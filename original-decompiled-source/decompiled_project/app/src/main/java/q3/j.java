package q3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.basitce.htmltoapk.data.apkgenerator.binaryxml.AndroidManifestAttrs;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class j {
    public static d a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        d dVarA;
        if (b(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new d(null, null, typedValue.data);
            }
            try {
                dVarA = d.a(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                dVarA = null;
            }
            if (dVarA != null) {
                return dVarA;
            }
        }
        return new d(null, null, 0);
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(AndroidManifestAttrs.NAMESPACE, str) != null;
    }

    public static TypedArray c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
