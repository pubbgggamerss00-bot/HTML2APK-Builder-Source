package org.jf.dexlib2.rewriter;

/* loaded from: classes3.dex */
public class TypeRewriter implements Rewriter<String> {
    public String rewriteUnwrappedType(String str) {
        return str;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public String rewrite(String str) {
        if (str.length() <= 0 || str.charAt(0) != '[') {
            return rewriteUnwrappedType(str);
        }
        int i10 = 0;
        while (str.charAt(i10) == '[') {
            i10++;
        }
        String strSubstring = str.substring(i10);
        String strRewriteUnwrappedType = rewriteUnwrappedType(strSubstring);
        if (strSubstring == strRewriteUnwrappedType) {
            return str;
        }
        StringBuilder sb = new StringBuilder(strRewriteUnwrappedType.length() + i10);
        sb.append((CharSequence) str, 0, i10);
        sb.append(strRewriteUnwrappedType);
        return sb.toString();
    }
}
