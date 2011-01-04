/*
 * This Work is in the public domain and is provided on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied,
 * including, without limitation, any warranties or conditions of TITLE,
 * NON-INFRINGEMENT, MERCHANTABILITY, or FITNESS FOR A PARTICULAR PURPOSE.
 * You are solely responsible for determining the appropriateness of using
 * this Work and assume any risks associated with your use of this Work.
 *
 * This Work includes contributions authored by David E. Jones, not as a
 * "work for hire", who hereby disclaims any copyright to the same.
 */
package org.moqui.service;

public interface ServiceCallSpecial extends ServiceCall {
    /** Add a service to run on commit of the current transaction using the ServiceXaWrapper */
    void registerOnCommit();

    /** Add a service to run on rollback of the current transaction using the ServiceXaWrapper */
    void registerOnRollback();
}
