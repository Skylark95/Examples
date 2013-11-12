package com.skylark95.examples.junit.mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

// Runner is only necessary for the @Mock annotation
@RunWith(MockitoJUnitRunner.class)
public class ClassWithDependencyTest {
    
    @Mock 
    private Dependency dependency;
    
    @Test
    public void canMockResponseAnnotationWay() {
        ClassWithDependency classWithDependency = new ClassWithDependency(dependency);
        when(dependency.getResponse()).thenReturn("Hello!");
        assertEquals("Hello!", classWithDependency.getResponseFromDependency());
    }
    
    @Test
    public void canMockResponseStaticMockMethodWay() {
        Dependency mockDependency = mock(Dependency.class);
        ClassWithDependency classWithDependency = new ClassWithDependency(mockDependency);
        when(mockDependency.getResponse()).thenReturn("Hello!");
        assertEquals("Hello!", classWithDependency.getResponseFromDependency());
    }

}
