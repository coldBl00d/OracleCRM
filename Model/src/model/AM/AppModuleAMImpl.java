package model.AM;


import model.AM.common.AppModuleAM;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.Key;
import oracle.jbo.NameValuePairs;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;

// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 16 11:43:09 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleAMImpl extends ApplicationModuleImpl implements AppModuleAM {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleAMImpl() {
    }

    /**
     * Container's getter for RolesTableR1.
     * @return RolesTableR1
     */
    public ViewObjectImpl getRolesTableR1() {
        return (ViewObjectImpl) findViewObject("RolesTableR1");
    }

    /**
     * Container's getter for RolesTableU1.
     * @return RolesTableU1
     */
    public ViewObjectImpl getRolesTableU1() {
        return (ViewObjectImpl) findViewObject("RolesTableU1");
    }


    /**
     * Container's getter for CategoryTableU1.
     * @return CategoryTableU1
     */
    public ViewObjectImpl getCategoryTableU1() {
        return (ViewObjectImpl) findViewObject("CategoryTableU1");
    }

    /**
     * Container's getter for ProductsU1.
     * @return ProductsU1
     */
    public ViewObjectImpl getProductsU1() {
        return (ViewObjectImpl) findViewObject("ProductsU1");
    }

    /**
     * Container's getter for UserFormU1.
     * @return UserFormU1
     */
    public ViewObjectImpl getUserFormU1() {
        return (ViewObjectImpl) findViewObject("UserFormU1");
    }


   
    /**
     * Container's getter for AddressU2.
     * @return AddressU2
     */
    public ViewObjectImpl getAddressU2() {
        return (ViewObjectImpl) findViewObject("AddressU2");
    }

    /**
     * Container's getter for LocationU2.
     * @return LocationU2
     */
    public ViewObjectImpl getLocationU2() {
        return (ViewObjectImpl) findViewObject("LocationU2");
    }

    /**
     * Container's getter for UsersU2.
     * @return UsersU2
     */
    public ViewObjectImpl getUsersU2() {
        return (ViewObjectImpl) findViewObject("UsersU2");
    }
    
    public void UpdateUser(){
        getDBTransaction().commit();
        ViewObjectImpl vo=getUsersU2();
        vo.executeQuery();
        Row row=vo.last();
        
        ViewObjectImpl vo1=getAddressU2();
        vo1.executeQuery();
        Row row1=vo1.last();
        
        row.setAttribute("AddressId", row1.getAttribute(0));
//        vo.insertRow(row);
    
        getDBTransaction().commit();
        
        
        
    }

    /**
     * Container's getter for UsersU1.
     * @return UsersU1
     */
    public ViewObjectImpl getUsersU1() {
        return (ViewObjectImpl) findViewObject("UsersU1");
    }

    /**
     * Container's getter for AllUserRolePairU1.
     * @return AllUserRolePairU1
     */
    public ViewObjectImpl getAllUserRolePairU1() {
        return (ViewObjectImpl) findViewObject("AllUserRolePairU1");
    }

    /**
     * Container's getter for UserRoleVL1.
     * @return UserRoleVL1
     */
    public ViewLinkImpl getUserRoleVL1() {
        return (ViewLinkImpl) findViewLink("UserRoleVL1");
    }


    /**
     * Container's getter for UserRoleLinkU1.
     * @return UserRoleLinkU1
     */
    public ViewObjectImpl getUserRoleLinkU1() {
        return (ViewObjectImpl) findViewObject("UserRoleLinkU1");
    }
}

