package org.jf.dexlib2.rewriter;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nc.j0;
import org.jf.dexlib2.base.reference.BaseTypeReference;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.Method;

/* loaded from: classes3.dex */
public class ClassDefRewriter implements Rewriter<ClassDef> {
    protected final Rewriters rewriters;

    public class RewrittenClassDef extends BaseTypeReference implements ClassDef {
        protected ClassDef classDef;

        public RewrittenClassDef(ClassDef classDef) {
            this.classDef = classDef;
        }

        @Override // org.jf.dexlib2.iface.ClassDef
        public int getAccessFlags() {
            return this.classDef.getAccessFlags();
        }

        @Override // org.jf.dexlib2.iface.ClassDef, org.jf.dexlib2.iface.Annotatable
        public Set<? extends Annotation> getAnnotations() {
            return RewriterUtils.rewriteSet(ClassDefRewriter.this.rewriters.getAnnotationRewriter(), this.classDef.getAnnotations());
        }

        @Override // org.jf.dexlib2.iface.ClassDef
        public Iterable<? extends Method> getDirectMethods() {
            return RewriterUtils.rewriteIterable(ClassDefRewriter.this.rewriters.getMethodRewriter(), this.classDef.getDirectMethods());
        }

        @Override // org.jf.dexlib2.iface.ClassDef
        public Iterable<? extends Field> getFields() {
            return new Iterable<Field>() { // from class: org.jf.dexlib2.rewriter.ClassDefRewriter.RewrittenClassDef.1
                @Override // java.lang.Iterable
                public Iterator<Field> iterator() {
                    return j0.b(RewrittenClassDef.this.getStaticFields().iterator(), RewrittenClassDef.this.getInstanceFields().iterator());
                }
            };
        }

        @Override // org.jf.dexlib2.iface.ClassDef
        public Iterable<? extends Field> getInstanceFields() {
            return RewriterUtils.rewriteIterable(ClassDefRewriter.this.rewriters.getFieldRewriter(), this.classDef.getInstanceFields());
        }

        @Override // org.jf.dexlib2.iface.ClassDef
        public List<String> getInterfaces() {
            return RewriterUtils.rewriteList(ClassDefRewriter.this.rewriters.getTypeRewriter(), this.classDef.getInterfaces());
        }

        @Override // org.jf.dexlib2.iface.ClassDef
        public Iterable<? extends Method> getMethods() {
            return new Iterable<Method>() { // from class: org.jf.dexlib2.rewriter.ClassDefRewriter.RewrittenClassDef.2
                @Override // java.lang.Iterable
                public Iterator<Method> iterator() {
                    return j0.b(RewrittenClassDef.this.getDirectMethods().iterator(), RewrittenClassDef.this.getVirtualMethods().iterator());
                }
            };
        }

        @Override // org.jf.dexlib2.iface.ClassDef
        public String getSourceFile() {
            return this.classDef.getSourceFile();
        }

        @Override // org.jf.dexlib2.iface.ClassDef
        public Iterable<? extends Field> getStaticFields() {
            return RewriterUtils.rewriteIterable(ClassDefRewriter.this.rewriters.getFieldRewriter(), this.classDef.getStaticFields());
        }

        @Override // org.jf.dexlib2.iface.ClassDef
        public String getSuperclass() {
            return (String) RewriterUtils.rewriteNullable(ClassDefRewriter.this.rewriters.getTypeRewriter(), this.classDef.getSuperclass());
        }

        @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
        public String getType() {
            return ClassDefRewriter.this.rewriters.getTypeRewriter().rewrite(this.classDef.getType());
        }

        @Override // org.jf.dexlib2.iface.ClassDef
        public Iterable<? extends Method> getVirtualMethods() {
            return RewriterUtils.rewriteIterable(ClassDefRewriter.this.rewriters.getMethodRewriter(), this.classDef.getVirtualMethods());
        }
    }

    public ClassDefRewriter(Rewriters rewriters) {
        this.rewriters = rewriters;
    }

    @Override // org.jf.dexlib2.rewriter.Rewriter
    public ClassDef rewrite(ClassDef classDef) {
        return new RewrittenClassDef(classDef);
    }
}
