import EventForm from '@/components/shared/EventForm'
import React from 'react'

const UpdateEvent = () => {

    
    return (
        <>
            <section className='bg-primary-50 bg-dotted-pattern bg-cober bg-center py-5 py:10'>
                <h3 className='h3-bold wrapper text-center sm:text-left'>
                    Create Event
                </h3>
            </section>
            <div className='wrapper my-8'>
                <EventForm  userId={1} type="Update " />
            </div>
        </>
    )
}

export default UpdateEvent