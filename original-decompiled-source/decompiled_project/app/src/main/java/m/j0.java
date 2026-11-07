package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import m.p;
import org.xmlpull.v1.XmlPullParserException;
import q3.e;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17143a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f17144b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f17145c;

    public j0(Context context, TypedArray typedArray) {
        this.f17143a = context;
        this.f17144b = typedArray;
    }

    public static j0 d(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new j0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public final ColorStateList a(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f17144b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateList = p3.b.getColorStateList(this.f17143a, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateList;
    }

    public final Drawable b(int i10) {
        int resourceId;
        TypedArray typedArray = this.f17144b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : i.a.c(this.f17143a, resourceId);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface c(int i10, int i11, p.a aVar) {
        p.a aVar2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = this.f17144b.getResourceId(i10, 0);
        Typeface typefaceA = null;
        if (resourceId != 0) {
            if (this.f17145c == null) {
                this.f17145c = new TypedValue();
            }
            TypedValue typedValue = this.f17145c;
            ThreadLocal<TypedValue> threadLocal = q3.g.f21890a;
            Context context = this.f17143a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (string.startsWith("res/")) {
                    int i12 = typedValue.assetCookie;
                    p.s<String, Typeface> sVar = r3.u.f23170b;
                    Typeface typeface = sVar.get(r3.u.b(resources, resourceId, string, i12, i11));
                    if (typeface != null) {
                        if (aVar != null) {
                            new Handler(Looper.getMainLooper()).post(new q3.h(aVar, typeface));
                        }
                        aVar2 = aVar;
                        typefaceA = typeface;
                    } else {
                        try {
                        } catch (IOException e10) {
                            e = e10;
                            aVar2 = aVar;
                        } catch (XmlPullParserException e11) {
                            e = e11;
                            aVar2 = aVar;
                        }
                        try {
                            if (string.toLowerCase().endsWith(".xml")) {
                                e.a aVarA = q3.e.a(resources.getXml(resourceId), resources);
                                if (aVarA == null) {
                                    try {
                                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                                        if (aVar != null) {
                                            aVar.a(-3);
                                        }
                                    } catch (IOException e12) {
                                        iOException = e12;
                                        aVar2 = aVar;
                                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                                        if (aVar2 != null) {
                                            aVar2.a(-3);
                                        }
                                        if (typefaceA == null) {
                                        }
                                        return typefaceA;
                                    } catch (XmlPullParserException e13) {
                                        xmlPullParserException = e13;
                                        aVar2 = aVar;
                                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                                        if (aVar2 != null) {
                                        }
                                        if (typefaceA == null) {
                                        }
                                        return typefaceA;
                                    }
                                } else {
                                    aVar2 = aVar;
                                    typefaceA = r3.u.a(context, aVarA, resources, resourceId, string, typedValue.assetCookie, i11, aVar2, true);
                                }
                            } else {
                                aVar2 = aVar;
                                int i13 = typedValue.assetCookie;
                                Typeface typefaceD = r3.u.f23169a.d(context, resources, resourceId, string, i11);
                                if (typefaceD != null) {
                                    sVar.put(r3.u.b(resources, resourceId, string, i13, i11), typefaceD);
                                }
                                if (aVar2 != null) {
                                    if (typefaceD != null) {
                                        new Handler(Looper.getMainLooper()).post(new q3.h(aVar2, typefaceD));
                                    } else {
                                        aVar2.a(-3);
                                    }
                                }
                                typefaceA = typefaceD;
                            }
                        } catch (IOException e14) {
                            e = e14;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                            if (aVar2 != null) {
                            }
                            if (typefaceA == null) {
                            }
                            return typefaceA;
                        } catch (XmlPullParserException e15) {
                            e = e15;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                            if (aVar2 != null) {
                            }
                            if (typefaceA == null) {
                            }
                            return typefaceA;
                        }
                    }
                    if (typefaceA == null || aVar2 != null) {
                        return typefaceA;
                    }
                    throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(resourceId) + " could not be retrieved.");
                }
                if (aVar != null) {
                    aVar.a(-3);
                }
                aVar2 = aVar;
                if (typefaceA == null) {
                }
                return typefaceA;
            }
        }
        return null;
    }

    public final void e() {
        this.f17144b.recycle();
    }
}
